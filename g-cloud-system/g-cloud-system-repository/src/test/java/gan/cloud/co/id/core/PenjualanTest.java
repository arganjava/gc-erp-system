package gan.cloud.co.id.core;

import gan.cloud.co.id.models.pos.Barang;
import gan.cloud.co.id.models.pos.Penjualan;
import gan.cloud.co.id.models.pos.PenjualanBarang;
import gan.cloud.co.id.repository.core.BarangRepository;
import gan.cloud.co.id.repository.core.PenjualanBarangRepository;
import gan.cloud.co.id.repository.core.PenjualanRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Argan on 29/04/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:META-INF/spring/**/applicationContext*.xml")
@ActiveProfiles({"repository", "LOC", "security"})
public class PenjualanTest {

    @Autowired
    private PenjualanRepository penjualanRepository;

    @Autowired
    private BarangRepository barangRepository;

    @Autowired
    private PenjualanBarangRepository penjualanBarangRepository;


    @Test
    public void insertPenjualan() {

        Barang barang001 = barangRepository.findOne("001");
        Barang barang002 = barangRepository.findOne("002");


        System.out.println("BARANG 2"+barang002.getCodeBarang());
        System.out.println("BARANG 1"+barang001.getCodeBarang());

        Penjualan penjualan = new Penjualan();
        penjualan.setNoPenjualan("002");
        /*barangs.add(barang001);
        barangs.add(barang002);
        barangs.add(barang003);*/

        penjualan.setStatus(true);
        penjualan.setPembayaran(100000D);

        PenjualanBarang penjualanBarang = new PenjualanBarang();
        penjualanBarang.setId("001");
        penjualanBarang.setBarang(barang001);
        penjualanBarang.setPenjualan(penjualan);
        penjualanBarang.setQuantity(2);
        PenjualanBarang penjualanBarang2 = new PenjualanBarang();
        penjualanBarang2.setId("002");
        penjualanBarang2.setBarang(barang002);
        penjualanBarang2.setPenjualan(penjualan);
        penjualanBarang2.setQuantity(2);
       /* PenjualanBarang penjualanBarang3 = new PenjualanBarang();
        penjualanBarang3.setId("003");
        penjualanBarang3.setBarang(barang003);
        penjualanBarang3.setPenjualan(penjualan);
        penjualanBarang3.setQuantity(2);
*/
        Set<PenjualanBarang> penjualanBarangs = new HashSet<PenjualanBarang>();
        penjualanBarangs.add(penjualanBarang);
        penjualanBarangs.add(penjualanBarang2);
       /* penjualanBarangs.add(penjualanBarang);*/
      /*  penjualanBarangs.clear();*/
        penjualanBarangs.clear();
        penjualan.setPenjualanBarangs(penjualanBarangs);

        penjualanRepository.save(penjualan);



    }

    @Test
    public void deletePenjualan() {
            Penjualan penjualan = penjualanRepository.findOne("001");
        penjualanRepository.delete(penjualan);

    }

}
