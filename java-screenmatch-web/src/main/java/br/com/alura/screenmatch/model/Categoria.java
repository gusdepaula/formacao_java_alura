package br.com.alura.screenmatch.model;

public enum Categoria {
    ACAO("Action", "Ação"),
    ROMANCE("Romance", "Romance"),
    COMEDIA("Comedy", "Comédia"),
    DRAMA("Drama", "Drama"),
    CRIME("Crime", "Crime"),
    AVENTURA("Adventure", "Aventura"),
    FICCAO_CIENTIFICA("Sci-Fi", "Ficção Científica"),
    FANTASIA("Fantasy", "Fantasia"),
    TERROR("Horror", "Terror"),
    ANIMACAO("Animation", "Animação"),
    SUSPENSE("Thriller", "Suspense"),
    FAMILY("Family", "Família"),
    HISTORICO("History", "Histórico"),
    DOCUMENTARIO("Documentary", "Documentário"),
    MUSICAL("Musical", "Musical"),
    GUERRA("War", "Guerra"),
    WESTERN("Western", "Faroeste"),
    MISTERIO("Mystery", "Mistério"),
    BIOGRAFIA("Biography", "Biografia");

    private String categoriaOmdb;

    private String categoriaPortugues;

    Categoria(String categoriaOmdb, String categoriaPortugues) {
        this.categoriaOmdb = categoriaOmdb;
        this.categoriaPortugues = categoriaPortugues;
    }

    public static Categoria fromString(String text) {
        for (Categoria categoria : Categoria.values()) {
            if (categoria.categoriaOmdb.equalsIgnoreCase(text)) {
                return categoria;
            }
        }
        throw new IllegalArgumentException("Nenhuma categoria encontrada para a string fornecida: " + text);
    }

    public static Categoria fromPortugues(String text) {
        for (Categoria categoria : Categoria.values()) {
            if (categoria.categoriaPortugues.equalsIgnoreCase(text)) {
                return categoria;
            }
        }
        throw new IllegalArgumentException("Nenhuma categoria encontrada para a string fornecida: " + text);
    }
}
