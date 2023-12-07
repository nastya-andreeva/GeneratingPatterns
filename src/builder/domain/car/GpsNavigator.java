package builder.domain.car;

public class GpsNavigator {
    private String route;

    public GpsNavigator() {
        this.route = "221b, Baker Street, London  to Scotland Yard, 8-10 Broadway, London";
    }

    public GpsNavigator(String manualRoute) {
        this.route = manualRoute;
    }

    public String getRoute() {
        return route;
    }

    @Override
    public String toString() {
        return "GpsNavigator{" +
                "route='" + route + '\'' +
                '}';
    }
}