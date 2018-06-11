package fatec.itapetininga.TelaAtividades;

/**
 * Created by Quoc Nguyen on 13-Dec-16.
 */

public class Atividade {
    private int id;

    private byte[] image;

    public Atividade(String name, String price, byte[] image, int id) {

        this.image = image;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
