class OrderService {
    private final OrderRepository orders;

    OrderService(OrderRepository orders) { this.orders = orders; }

    OrderView find(String id) {
        return orders.findById(id).map(this::view).orElseThrow();
    }

    private OrderView view(OrderEntity order) {
        return new OrderView(order.getId(), order.getStatus());
    }
}
