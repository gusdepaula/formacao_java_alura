package br.com.alura.screenmatch.model;

public enum Categoria {
    DRAMA("Drama"),
    COMEDIA("Comedy"),
    AVENTURA("Adventure"),
    FICCAO_CIENTIFICA("Sci-Fi"),
    FANTASIA("Fantasy"),
    ACAO("Action"),
    TERROR("Horror"),
    ROMANCE("Romance"),
    DOCUMENTARIO("Documentary"),
    ANIMACAO("Animation"),
    MUSICAL("Musical"),
    SUSPENSE("Thriller"),
    OUTRO("Other");

    private String categoriaOmdb;

    Categoria(String categoriaOmdb) {
        this.categoriaOmdb = categoriaOmdb;
    }

    public static Categoria fromString(String text) {
        for (Categoria categoria : Categoria.values()) {
            if (categoria.categoriaOmdb.equalsIgnoreCase(text)) {
                return categoria;
            }
        }
        return OUTRO;
    }
}
