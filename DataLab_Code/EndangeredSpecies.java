class EndangeredSpecies {
    private String name;
    private String status;
    private String description;

    public EndangeredSpecies(String name, String status, String description) {
        this.name = name;
        this.status = status;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public String getDescription() {
        return description;
    }
}