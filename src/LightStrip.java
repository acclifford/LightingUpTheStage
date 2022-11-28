import java.util.*;
public class LightStrip {

    private ArrayList<Light> lightStrip;

    int numberOfLights;


    public LightStrip() {


        numberOfLights = 0;

        lightStrip = new ArrayList<>();
    }
    /*
    public void display() {
        for (int index6 = 0; index6 < numberOfLights; index6++) {
            System.out.print(index6 + ": ");
            System.out.println(lightMember[index6]);
        }
        for (int index3 = 0; index3 < numberOfLights; index3++) {
            totalLumens += lightMember[index3].getLumens();
        }
        System.out.println("Total lumens = " + totalLumens);

        for (int index4 = 0; index4 < numberOfLights; index4++) {
            if (lightMember[index4].isFlourescent()) {
                totalFlourescent = totalFlourescent + 1;
            }
        }
        System.out.println("Flourescent = " + totalFlourescent);

        for (int index5 = 0; index5 < numberOfLights; index5++) {
            totalHeatOutput += lightMember[index5].heatOutput();
        }
        System.out.println("Heat output = " + totalHeatOutput);
    }

*/

    public void display() {

        for (int index6 = 0; index6 < lightStrip.size(); index6++) {
            System.out.print(index6 + ": ");
            System.out.println(lightStrip.get(index6));
        }
        System.out.println("Total lumens = " + this.countTotalLumens());
        System.out.println("Flourescent = " + this.countIsFlourescent());
        System.out.println("Heat output = " + this.countHeatOutput());


    }

    public int countIsFlourescent() {
        int totalFlourescent;
        totalFlourescent = 0;

        for (int index = 0; index < lightStrip.size(); index++) {
            if (((Light) lightStrip.get(index)).isFlourescent()) {
                totalFlourescent = totalFlourescent + 1;
            }
        }
        return totalFlourescent;
    }

    public double countHeatOutput() {
        int totalHeatOutput;
        totalHeatOutput = 0;
        for (int index = 0; index < lightStrip.size(); index++) {
            totalHeatOutput += lightStrip.get(index).heatOutput();
        }
        return totalHeatOutput;
    }

    public double countTotalLumens() {
        double totalLumens;
        totalLumens = 0;
        for (int index3 = 0; index3 < lightStrip.size(); index3++) {
            totalLumens += lightStrip.get(index3).getLumens();
        }
        return totalLumens;
    }

    public void addLight(Light lightMemeber) {
        lightStrip.add(lightMemeber);
    }

    /*
       public void addLight (Flourescent lumens){
           lightMember[numberOfLights] = new Flourescent();
           numberOfLights++;
       }

       public void addLight (Incandescent lumens){
           lightMember[numberOfLights] = new Incandescent();
           numberOfLights++;
       }
*/
    public void removeLight(int index) {

        if (index < lightStrip.size()) {
            lightStrip.remove(index);
            numberOfLights--;
        } else {
            System.out.println("ERROR: No light at that index");
        }
    }
}





