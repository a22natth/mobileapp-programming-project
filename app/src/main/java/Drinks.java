import com.google.gson.annotations.SerializedName;

public class Drinks {

    @SerializedName("ID")
    private String id;
    private String name;
    private String type;
    private String company;
    private String location;
    private String category;
    @SerializedName("cost")
    private int dollars;



}
