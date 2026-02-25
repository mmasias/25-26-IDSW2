import java.time.LocalDate;

class Subscription {
    private int id;
    private LocalDate startDate;
    private LocalDate endDate;
    private SubscriptionStatus status;
    private String paymentMethod;
    private Plan plan;
}
