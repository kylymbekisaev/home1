public enum Color {
    BLACK("#000000"),
    WHITE("#FFFFFF"),
    GRAY("#JKGKDHG"),
    BROWN("#HGKUHSSH");
    private String colorCode;

    public String getColorCode() {
        return colorCode;
    }

    Color(String colorCode){
        this.colorCode = colorCode;
    }
}
