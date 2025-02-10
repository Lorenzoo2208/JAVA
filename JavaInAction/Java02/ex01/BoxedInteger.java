package JavaInAction.Java02.ex01;

class BoxedInteger {
    private Integer number;
    
    public static void main(String[] args) {
        BoxedInteger bn = new BoxedInteger(42);
        System.out.println(bn.getNumber());
        
        bn.setNumber(99);
        System.out.println(bn.getNumber());
    }

    BoxedInteger(Integer number){
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }



}
