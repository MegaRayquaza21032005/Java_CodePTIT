public enum Season {
    SPRING("warm", "123"), SUMMER("hot", "456"),
    AUTUM("cool", "789"), WINTER("cold", "101112");
    private String weather, month;

    Season(String weather, String month) {
        this.weather = weather;  // Season.SPRING.weather = "warm
        this.month = month;      // Season.WINTER.month = "101112"
    }
    public String getWeather() {
        return weather;
    }
    public String getMonth() {
        return month;
    }
}
