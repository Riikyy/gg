package cn.ricky.gg;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {
    private String type;
    private Value value;
    public String getType() {
        return type;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }
    public Quote(){}

    public  void setType(String type){
        this.type=type;
    }
    @Override
    public String toString(){
        return "Quote{"+"type="+type+",value="+value+"}";
    }
}
