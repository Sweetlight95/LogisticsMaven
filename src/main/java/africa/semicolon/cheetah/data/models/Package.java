package africa.semicolon.cheetah.data.models;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor
public class Package {
    private Integer id;
    private String name;
    private String senderEmail;
    private String receiverName;
    private String deliveryAddress;
    private double netWeight;
    private String receiverPhone;
}
