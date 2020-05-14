package untact_tutor_store판ㅁ;

public class PaymentCanceled extends AbstractEvent {

    private Long id;

    public PaymentCanceled(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
