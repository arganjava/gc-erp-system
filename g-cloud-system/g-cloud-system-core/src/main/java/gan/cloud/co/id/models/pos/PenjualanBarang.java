package gan.cloud.co.id.models.pos;

import javax.persistence.*;

/**
 * Created by Argan on 30/04/14.
 */
@Entity
@Table(name = "TN_PENJUALAN_BARANG")
public class PenjualanBarang {

    @Id
    @Column(name = "CV_PENJUALAN_BARANG_ID")
/*    @GenericGenerator(name = "uuid", strategy = "uuid2")*/
    private  String id;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    @JoinColumn(name = "CODE_BARANG", nullable = false)
    private Barang barang ;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    @JoinColumn(name = "NO_PENJUALAN", nullable = false)
    private Penjualan penjualan ;

    @Column(name = "QUANTITY")
    private int quantity;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Barang getBarang() {
        return barang;
    }

    public void setBarang(Barang barang) {
        this.barang = barang;
    }

    public Penjualan getPenjualan() {
        return penjualan;
    }

    public void setPenjualan(Penjualan penjualan) {
        this.penjualan = penjualan;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
