public enum SeasonSP30_1_2 {

    //phần hằng số
    Spring("Xuân"), Summer("hạ"), Fall("thu"), Winter("đông");


    //constructor
    SeasonSP30_1_2(String name) {
        value = name;
    }

    //properties
    private String value;

    //các method thực thi (getter)
    public String getValue() {
        return value;
    }
}
