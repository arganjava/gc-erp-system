package gan.cloud.co.id.models.pos;

import javax.persistence.*;

/**
 * Created by Argan on 29/04/14.
 */
@Entity
@Table(name = "TN_BARANG", uniqueConstraints =@UniqueConstraint(columnNames = "namaBarang", name = "namaBarang"))
public class Barang {

    @Id
    @Column(name = "CODE_BARANG",length = 7)
    private String codeBarang;
    @Column(name = "namaBarang", unique = true, length = 15, nullable = false)
    private String namaBarang;
    private Double hargaBeliBarang;
    @Column(name = "hargaJualBarang", nullable = false)
    private Double hargeJualBarang;
    private int quantity;

   /* @OneToMany( cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy = "barang", orphanRemoval = true )
    @org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.PERSIST})
    @Column( name = "barang", nullable = false  )
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<PenjualanBarang> penjualanSet= new HashSet<PenjualanBarang>();*/
   /* @ManyToMany(mappedBy="barangSet")
    private Set<Penjualan> penjualanSet= new HashSet<Penjualan>();*/

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCodeBarang() {
        return codeBarang;
    }

    public void setCodeBarang(String codeBarang) {
        this.codeBarang = codeBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public Double getHargaBeliBarang() {
        return hargaBeliBarang;
    }

    public void setHargaBeliBarang(Double hargaBeliBarang) {
        this.hargaBeliBarang = hargaBeliBarang;
    }

    public Double getHargeJualBarang() {
        return hargeJualBarang;
    }

    public void setHargeJualBarang(Double hargeJualBarang) {
        this.hargeJualBarang = hargeJualBarang;
    }



}
