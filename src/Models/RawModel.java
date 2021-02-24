package src.Models;

public class RawModel {
    
    int vaoID;
    int verterxCount;


    public RawModel(int vaoID, int verterxCount){
        this.vaoID = vaoID;
        this.verterxCount = verterxCount;
    }

    public int getvaoID(){
        return vaoID;
    }

    public int getvertexCount() {
        return verterxCount;
    }
}
