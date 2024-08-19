package shabrina;
//Drive Class
public class SiswaTester {
        public static void main(String[] args) {
            //membuat Object
            //namaClass namaObject = new Constructor();
            Siswa shabrina = new Siswa();
            Siswa rasyid = new Siswa();
            Siswa anggito = new Siswa ();
            Siswa cila = new Siswa ();
            Siswa  aya = new Siswa ();
    
            shabrina.id = 32;
            shabrina.nama = "Shabrina";
            shabrina.ipk = 99.5;
            rasyid.id = 30;
            rasyid.nama = "rasyid";
            rasyid.ipk = 77.4;
            anggito.id = 4;
            anggito.nama = "anggito";
            anggito.ipk = 98.5;
            cila.id = 7;
            cila.nama = "cila";
            cila.ipk = 55.3;
            aya.id = 36;
            aya.nama = "aya";
            aya.ipk = 99.5;

            shabrina.print();
            rasyid.print();
            anggito.print();
            cila.print();
            aya.print();
        }
}
