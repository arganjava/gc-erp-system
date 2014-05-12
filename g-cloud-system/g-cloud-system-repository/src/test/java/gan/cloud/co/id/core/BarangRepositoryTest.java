package gan.cloud.co.id.core;

import gan.cloud.co.id.models.pos.Barang;
import gan.cloud.co.id.repository.core.BarangRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Argan on 29/04/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:META-INF/spring/**/applicationContext*.xml")
@ActiveProfiles({"repository", "LOC","security"})
public class BarangRepositoryTest {

    @Autowired
    private BarangRepository barangRepository;

    @Test
    public void insertBarang(){
        Barang barang = new Barang();
        barang.setCodeBarang("001");
        barang.setNamaBarang("Diterjen");
        barang.setHargaBeliBarang(4000D);
        barang.setHargeJualBarang(5000D);
        barang.setQuantity(20);

        Barang barang2 = new Barang();
        barang2.setCodeBarang("002");
        barang2.setNamaBarang("Shampoo");
        barang2.setHargaBeliBarang(4000D);
        barang2.setHargeJualBarang(5000D);
        barang2.setQuantity(20);

     /*   Barang barang3 = new Barang();
        barang3.setCodeBarang("003");
        barang3.setNamaBarang("Sabun");
        barang3.setHargaBeliBarang(4000D);
        barang3.setHargeJualBarang(5000D);
        barang3.setQuantity(20);*/

        barangRepository.save(barang);
        barangRepository.save(barang2);


    }

}
