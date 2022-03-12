public class BmiService {
    public float calculate (float weight, float height){
        float height2 = (float) (height * height);
        float index = (float) weight / height2;
        return (float) index;
    }

}
