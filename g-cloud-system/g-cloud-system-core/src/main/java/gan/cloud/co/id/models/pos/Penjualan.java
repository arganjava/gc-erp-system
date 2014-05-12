package gan.cloud.co.id.models.pos;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Argan on 29/04/14.
 */
@Entity
@Table(name = "TN_PENJUALAN")
public class Penjualan {

    @Id
    @Column(name = "NO_PENJUALAN", length = 15)
    private String noPenjualan;
    private Date tanggalPenjualan;
    private Double pembayaran;
    private boolean status;

   /* @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE}, mappedBy = "penjualan", orphanRemoval = true)
   *//* @Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})*//*
    @Column(name = "penjualan", nullable = false)
  *//*  @LazyCollection(LazyCollectionOption.FALSE)*//*
    private Set<PenjualanBarang> penjualanSet= new HashSet<PenjualanBarang>();*/


    @OneToMany( fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST , CascadeType.MERGE }, mappedBy = "penjualan", orphanRemoval = true)
    @Column(name = "penjualan", nullable = false)
    private Set<PenjualanBarang> penjualanBarangs= new HashSet<PenjualanBarang>();

    public Set<PenjualanBarang> getPenjualanBarangs() {
        return penjualanBarangs;
    }

    public void setPenjualanBarangs(Set<PenjualanBarang> penjualanBarangs) {
        this.penjualanBarangs = penjualanBarangs;
    }

    public String getNoPenjualan() {
        return noPenjualan;
    }

    public void setNoPenjualan(String noPenjualan) {
        this.noPenjualan = noPenjualan;
    }

    public Date getTanggalPenjualan() {
        return tanggalPenjualan;
    }

    public void setTanggalPenjualan(Date tanggalPenjualan) {
        this.tanggalPenjualan = tanggalPenjualan;
    }

    public Double getPembayaran() {
        return pembayaran;
    }

    public void setPembayaran(Double pembayaran) {
        this.pembayaran = pembayaran;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
