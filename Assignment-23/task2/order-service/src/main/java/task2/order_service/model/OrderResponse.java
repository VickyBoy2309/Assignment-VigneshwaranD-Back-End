package task2.order_service.model;

public class OrderResponse {

    private int orderId;
    private String product;
    private User user;

    public OrderResponse(int orderId, String product, User user) {
        this.orderId = orderId;
        this.product = product;
        this.user = user;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getProduct() {
        return product;
    }

    public User getUser() {
        return user;
    }
}