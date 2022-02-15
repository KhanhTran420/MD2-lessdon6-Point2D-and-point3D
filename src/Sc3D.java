public class Sc3D extends Sc2D {
    private float z = 0.0f;

    public Sc3D(){

    }
    public Sc3D(float x, float y, float z){
        super(x,y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(){
        this.x=x;
        this.y=y;
        this.z=z;
    }

    public float[] getXYZ(){
        float[] array = {x,y,z};
        return array;
    }

    @Override
    public String toString() {
        return "Sc3D{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
