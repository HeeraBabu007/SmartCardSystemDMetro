import java.time.LocalDateTime;

public class FareCalculator {

    public double getFare(Station source, Station destination, LocalDateTime localDateTime) {
        FareStrategy fareStrategy = FareStrategyFactory.getFareStrategy(localDateTime);
        int distance = source.distance(destination);
        double fare = distance * fareStrategy.getFarePerStation();
        return fare;
    }
}
