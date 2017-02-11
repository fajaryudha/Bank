import javax.swing.JOptionPane;
class setor{
    private int saldo;
    public void menabung (int bal, int s){
        if (s%100!=0)
            JOptionPane.showMessageDialog(null,"Mesin ATM BRI tidak menerima uang koin \n Silahkan ulangi kembali","Transaksi gagal",0);
        else if (s<50000)
            JOptionPane.showMessageDialog(null,"Besaran minimal setor tunai adalah Rp.50000,00","ERROR",0);
        else if (s>=50000){
            saldo = bal + s;
            JOptionPane.showMessageDialog(null,"Saldo anda saat ini sebesar: "+saldo );
        }
    }
    public int getsaldo(){
                return saldo;
            }
}