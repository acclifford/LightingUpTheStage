public class LightStrip {

    private Light[] lightMember;
    private int numberOfLights;

    private double totalLumens;
    private int totalFlourescent;
    private double totalHeatOutput;


    public LightStrip() {

        lightMember = new Light[10];
        numberOfLights = 0;

        totalLumens = 0;
        totalFlourescent = 0;
        totalHeatOutput = 0;
    }

    public void display(){
        for (int index6 = 0; index6 < numberOfLights; index6++){
            System.out.print(index6 + ": ");
            System.out.println(lightMember[index6]);
        }
        for(int index3 = 0; index3 < numberOfLights; index3++){
            totalLumens += lightMember[index3].getLumens();
        }
        System.out.println("Total lumens = " + totalLumens);

        for(int index4 = 0; index4 < numberOfLights; index4++){
            if(lightMember[index4].isFlourescent()){
                totalFlourescent = totalFlourescent + 1;
            }
        }
        System.out.println("Flourescent = " + totalFlourescent);

        for(int index5 = 0; index5 < numberOfLights; index5++){
            totalHeatOutput += lightMember[index5].heatOutput();
        }
        System.out.println("Heat output = " + totalHeatOutput);
    }




    public void addLight(Flourescent lumens) {
        lightMember[numberOfLights] = new Flourescent();
        numberOfLights++;
        }

    public void addLight (Incandescent lumens){
        lightMember[numberOfLights] = new Incandescent();
        numberOfLights++;
        }

   public double removeLight (int index){

        numberOfLights--;

        if(lightMember[index] == null){
            System.out.println("ERROR: No light at that index");
            return 0;
        }
        totalLumens -= lightMember[index].getLumens();
        if(lightMember[index].isFlourescent()){
            totalFlourescent--;
        }
        if(lightMember[index].heatOutput() != 0){
            totalHeatOutput -= lightMember[index].heatOutput();
        }
        lightMember[index] = null;

        return totalLumens;
        }
    }

