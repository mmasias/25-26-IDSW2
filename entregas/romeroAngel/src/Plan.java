class Plan {
    private int id;
    private String name;
    private double price;
    private int maxProfiles;
    private boolean allowOffline;

    public Plan(int id, String name, double price, int maxProfiles, boolean allowOffline) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.maxProfiles = maxProfiles;
        this.allowOffline = allowOffline;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getMaxProfiles() {
        return maxProfiles;
    }

    public boolean isAllowOffline() {
        return allowOffline;
    }

    @Override
    public String toString() {
        return "=======" + "Plan: " + name + "=======" + "\n" + 
                "Price: €" + price + "\n" +
                "Max Profiles: " + maxProfiles + "\n" +
                "Allow Offline: " + allowOffline + "\n" 
}
