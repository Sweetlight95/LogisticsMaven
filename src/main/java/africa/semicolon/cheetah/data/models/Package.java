package africa.semicolon.cheetah.data.models;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor
public class Package {
    private Integer trackingNumber;
    private String name;
    private String senderName;
    private String receiverName;
    private String deliveryAddress;
    private double netWeight;
    private String senderPhone;
    private String receiverPhone;
}
