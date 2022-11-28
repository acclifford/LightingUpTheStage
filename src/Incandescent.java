public class Incandescent extends Light {

    public Incandescent(int lumens){
       super(lumens);
    }

    @Override
    public double heatOutput(){
       return (this.getLumens() * 87.4);
    }

    @Override
    public boolean isFlourescent(){
        return false;
    }




}
