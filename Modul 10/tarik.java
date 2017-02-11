import javax.swing.JOptionPane;
public class tarik{
    private int saldo;
    public void ambil(int tab,int t){
        if (t%100!=0)
            JOptionPane.showMessageDialog(null,"mesin ATM BRI Tidak Menerima uang koin \n silahkan ulangi lagi","Transaksi gagal",0);
        else {
            if (t>tab)
                JOptionPane.showMessageDialog(null, "saldo transaksi anda tidak mencukupi \n silahkan lakukan penyetoran","transaksi gagal",0);
            else if (t<50000)
             JOptionPane.showMessageDialog(null,"Besaran minimal pengambilan adalah Rp 50000","Transaksi Gagal",0);
            else {
                saldo = tab-t;
                JOptionPane.showMessageDialog(null,"saldo Anda saat ini sebesar :" +saldo);
                if (tab<=50000)
                JOptionPane.showMessageDialog(null,"saldo minimal harus Rp 50000,00, segera lakukan Penyetoran untuk menghindari penutupan akun.","Caution",2);
            }
        }
    }
    public int getsaldo(){
        return saldo;
    }
}