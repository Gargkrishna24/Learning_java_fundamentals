package day4.oop.encapsulaton.constructor;

public class Constructor {
    public String carName;
    public String carColor;

/*   public Constructor(String carColor,String carName){
//        this.carColor=carColor;
//        this.carName=carName;
//    }
//    Constructor(){
//        carName="wagnor";
//        carColor="blue";
//
   }
 */
    public Constructor(){
        carColor="blue";
        carName="Wagnor";
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    @Override
    public String toString() {
        return "Constructor{" +
                "carName='" + carName + '\'' +
                ", carColor='" + carColor + '\'' +
                '}';
    }
}
