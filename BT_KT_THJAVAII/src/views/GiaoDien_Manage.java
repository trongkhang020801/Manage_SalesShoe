/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import main.dao.BanHangdao;
import main.dao.DanhMucSanPhamdao;
import main.dao.NhanVienDao;
import main.dao.NhapHangdao;
import main.dao.QuanLiAodao;
import main.dao.QuanLiKhacdao;
import main.dao.QuanLiKhachHangdao;
import main.dao.QuanLiQuandao;
import main.model.BanHang;
import main.model.DanhMucSanPham;
import main.model.NhanVien;
import main.model.NhapHang;
import main.model.QuanLiAo;
import main.model.QuanLiKhachHang;
import main.model.QuanLiQuan;
import main.model.QuanLiKhac;



/**
 *
 * @author K2001
 */
public class GiaoDien_Manage extends javax.swing.JFrame {

    DefaultTableModel defaultTableModel1;
    DefaultTableModel defaultTableModel2;
    DefaultTableModel defaultTableModel3;
    DefaultTableModel defaultTableModel4;
    DefaultTableModel defaultTableModel5;
    DefaultTableModel defaultTableModel6;
    DefaultTableModel defaultTableModel7;
    DefaultTableModel defaultTableModel8;
    DefaultTableModel defaultTableModel9;
    BanHangdao userBH;
    DanhMucSanPhamdao userDM;
    NhanVienDao userNV;
    NhapHangdao userNH;
    QuanLiAodao userAo;
    QuanLiQuandao userQuan;
    QuanLiKhacdao userKhac;
    QuanLiKhachHangdao userKH;
    
    
    /**
     * Creates new form GiaoDien_Manage
     */
    public GiaoDien_Manage() {
      
        initComponents();
        
        defaultTableModel1 = new DefaultTableModel();
        defaultTableModel2 = new DefaultTableModel();
        defaultTableModel3 = new DefaultTableModel();
        defaultTableModel4 = new DefaultTableModel();
        defaultTableModel5 = new DefaultTableModel();
        defaultTableModel6 = new DefaultTableModel();
        defaultTableModel7 = new DefaultTableModel();
        defaultTableModel8 = new DefaultTableModel();
        defaultTableModel9 = new DefaultTableModel();
        userBH = new BanHangdao();
        userDM = new DanhMucSanPhamdao();
        userAo = new QuanLiAodao();
        userKH = new QuanLiKhachHangdao();
        userKhac = new QuanLiKhacdao();
        userQuan = new QuanLiQuandao();
        userNH = new NhapHangdao();
        userNV = new NhanVienDao();
        tbl1.setModel(defaultTableModel1);
        defaultTableModel1.addColumn("STT");
        defaultTableModel1.addColumn("Mã nhập hàng");
        defaultTableModel1.addColumn("Tên sản phẩm");
        defaultTableModel1.addColumn("Tên danh mục");
        defaultTableModel1.addColumn("Người nhận");
        defaultTableModel1.addColumn("Giá");
        defaultTableModel1.addColumn("Số lượng");
        defaultTableModel1.addColumn("Nhà phân phối");
        defaultTableModel1.addColumn("Người giao");
        defaultTableModel1.addColumn("Ngày nhập");
        defaultTableModel1.addColumn("Tổng tiền");
        int stttbl1=0;
        List<NhapHang> user_NH = userNH.getAll();
        for(NhapHang users : user_NH){
            stttbl1++;
            defaultTableModel1.addRow(new Object[]{stttbl1, users.getMaNH(),users.getTenSP(),users.getTenDM(),users.getNguoiNhan(),users.getGia(),
            users.getSoLuong(),users.getNhaPhanPhoi(),users.getNguoiGiao(),users.getNgayNhap(),users.getTongTien()});
        }
        
        tbl2.setModel(defaultTableModel2);
        defaultTableModel2.addColumn("STT");
        defaultTableModel2.addColumn("Mã đơn hàng");
        defaultTableModel2.addColumn("Tên khách hàng");
        defaultTableModel2.addColumn("Tên sản phẩm");
        defaultTableModel2.addColumn("Giá");
        defaultTableModel2.addColumn("Số lượng");
        defaultTableModel2.addColumn("Size");
        defaultTableModel2.addColumn("Ngày Bán");
        defaultTableModel2.addColumn("Tổng tiền");
        int stttbl2 =0;
        List<BanHang> user_BH = userBH.getAll();
        for(BanHang users : user_BH){
            stttbl2++;
            defaultTableModel2.addRow(new Object[]{stttbl2,users.getMaDH(),users.getHotenKH(),users.getTenSP(),users.getGia(),users.getSoLuong(),users.getSize(),users.getNgayBan(),users.getTongTien()});
        }
        
        tbl3.setModel(defaultTableModel3);
        defaultTableModel3.addColumn("STT");
        defaultTableModel3.addColumn("Mã sản phẩm");
        defaultTableModel3.addColumn("Tên sản phẩm");
        defaultTableModel3.addColumn("Tên danh mục");
        defaultTableModel3.addColumn("Size");
        defaultTableModel3.addColumn("Số lượng còn");
        defaultTableModel3.addColumn("Giá bán");
        defaultTableModel3.addColumn("Ngày nhập");
        
        int stttbl3=0;
        List<QuanLiAo> user_AO = userAo.getAll();
        for(QuanLiAo users :user_AO){
            stttbl3++;
            defaultTableModel3.addRow(new Object[]{stttbl3,users.getMaSP(),users.getTenSP(),users.getTenDM(),users.getSize(),users.getSoLuong(),users.getGiaBan(),users.getNgayNhap()});
        }
        
        tbl4.setModel(defaultTableModel4);
        defaultTableModel4.addColumn("STT");
        defaultTableModel4.addColumn("Mã sản phẩm");
        defaultTableModel4.addColumn("Tên sản phẩm");
        defaultTableModel4.addColumn("Tên danh mục");
        defaultTableModel4.addColumn("Size");
        defaultTableModel4.addColumn("Số lượng còn");
        defaultTableModel4.addColumn("Giá bán");
        defaultTableModel4.addColumn("Ngày nhập");
        
        int stttbl4=0;
        List<QuanLiQuan> user_Quan = userQuan.getAll();
        for(QuanLiQuan users :user_Quan){
            stttbl4++;
            defaultTableModel4.addRow(new Object[]{stttbl4,users.getMaSP(),users.getTenSP(),users.getTenDM(),users.getSize(),users.getSoLuong(),users.getGiaBan(),users.getNgayNhap()});
        }
        tbl5.setModel(defaultTableModel5);
        defaultTableModel5.addColumn("STT");
        defaultTableModel5.addColumn("Mã sản phẩm");
        defaultTableModel5.addColumn("Tên sản phẩm");
        defaultTableModel5.addColumn("Tên danh mục");
        defaultTableModel5.addColumn("Size");
        defaultTableModel5.addColumn("Số lượng còn");
        defaultTableModel5.addColumn("Giá bán");
        defaultTableModel5.addColumn("Ngày nhập");
        
        int stttbl5=0;
        List<QuanLiKhac> user_Khac = userKhac.getAll();
        for(QuanLiKhac users :user_Khac){
            stttbl5++;
            defaultTableModel5.addRow(new Object[]{stttbl5,users.getMaSP(),users.getTenSP(),users.getTenDM(),users.getSize(),users.getSoLuong(),users.getGiaBan(),users.getNgayNhap()});
        }
        
        tbl6.setModel(defaultTableModel6);
        defaultTableModel6.addColumn("STT");
        defaultTableModel6.addColumn("Mã khách hàng");
        defaultTableModel6.addColumn("Tên khách hàng");
        defaultTableModel6.addColumn("Giới tính");
        defaultTableModel6.addColumn("Ngày sinh");
        defaultTableModel6.addColumn("Địa chỉ");
        defaultTableModel6.addColumn("SĐT");
        defaultTableModel6.addColumn("Ngày đăng kí");
        int stttbl6 =0;
        List<QuanLiKhachHang> user_KH =userKH.getAll();
        for(QuanLiKhachHang users : user_KH){
            stttbl6++;
            defaultTableModel6.addRow(new Object[]{stttbl6,users.getMaKH(),users.getHoten(),users.getGioiTinh(),users.getNgaySinh(),users.getDiaChi(),users.getSDT(),users.getNgayDK()});
        }
        
        tbl7.setModel(defaultTableModel7);
        defaultTableModel7.addColumn("STT");
        defaultTableModel7.addColumn("Mã nhân viên");
        defaultTableModel7.addColumn("Họ tên");
        defaultTableModel7.addColumn("Giới tính");
        defaultTableModel7.addColumn("Ngày sinh");
        defaultTableModel7.addColumn("Địa chỉ");
        defaultTableModel7.addColumn("Chức vụ");
        defaultTableModel7.addColumn("Lương cơ bản");
        defaultTableModel7.addColumn("CMND");
        defaultTableModel7.addColumn("SDT");
        defaultTableModel7.addColumn("Ngày bắt đầu");
        int stttbl7=0;
        List<NhanVien> user_NV = userNV.getAll();
        for(NhanVien users : user_NV){
            stttbl7++;
            cbbnguoinhan1.addItem(users.getHoTen());
            defaultTableModel7.addRow(new Object[]{stttbl7,users.getMaNV(),users.getHoTen(),users.getGioiTinh(),users.getNgaySinh(),users.getDiaChi(),users.getChuVu(),users.getLuongCB(),
            users.getCmnd(),users.getSdt(),users.getNgayBD()});
        }
        
        tbl8.setModel(defaultTableModel8);
        defaultTableModel8.addColumn("STT");
        defaultTableModel8.addColumn("Mã danh mục");
        defaultTableModel8.addColumn("Tên danh mục");
        
        int stttbl8=0;
        List<DanhMucSanPham> user_DM = userDM.getAll();
        for(DanhMucSanPham users : user_DM){
            stttbl8++;
            cbbdm3.addItem(users.getTenDM());
            cbbdm4.addItem(users.getTenDM());
            cbbdm5.addItem(users.getTenDM());
            cbbdanhmuc1.addItem(users.getTenDM());
            defaultTableModel8.addRow(new Object[]{stttbl8,users.getMaDM(),users.getTenDM()});
        }
   
        tbl9.setModel(defaultTableModel9);
        defaultTableModel9.addColumn("STT");
        defaultTableModel9.addColumn("Tên sản phẩm");
        defaultTableModel9.addColumn("Số lượng bán");
        defaultTableModel9.addColumn("Ngày bán");
        int stt=0;
        List<BanHang> banhang = userBH.getAll();
        for(BanHang users : banhang){
            stt++;
            defaultTableModel9.addRow(new Object[]{stt,users.getTenSP(),users.getSoLuong(),users.getNgayBan()});
        }
    }
         

    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jTabbedPane34 = new javax.swing.JTabbedPane();
        jPanel42 = new javax.swing.JPanel();
        jTabbedPane33 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txthoten2 = new javax.swing.JTextField();
        txttensp2 = new javax.swing.JTextField();
        txtsoluong2 = new javax.swing.JTextField();
        txtadd2 = new javax.swing.JButton();
        btndelete2 = new javax.swing.JButton();
        btnsua2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl2 = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        txtsize2 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtgia2 = new javax.swing.JTextField();
        jLabel189 = new javax.swing.JLabel();
        jLabel190 = new javax.swing.JLabel();
        txttongtien2 = new javax.swing.JLabel();
        txtmadh2 = new javax.swing.JLabel();
        btnsua4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtngayban2 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jPanel43 = new javax.swing.JPanel();
        jLabel168 = new javax.swing.JLabel();
        jLabel169 = new javax.swing.JLabel();
        jLabel170 = new javax.swing.JLabel();
        jLabel171 = new javax.swing.JLabel();
        txttensp1 = new javax.swing.JTextField();
        txtsoluong1 = new javax.swing.JTextField();
        txtnhaphanphoi1 = new javax.swing.JTextField();
        btnadd1 = new javax.swing.JButton();
        btnsua1 = new javax.swing.JButton();
        jLabel172 = new javax.swing.JLabel();
        cbbdanhmuc1 = new javax.swing.JComboBox<>();
        jLabel173 = new javax.swing.JLabel();
        jLabel174 = new javax.swing.JLabel();
        cbbnguoinhan1 = new javax.swing.JComboBox<>();
        txtnguoigiao1 = new javax.swing.JTextField();
        btndelete1 = new javax.swing.JButton();
        jScrollPane19 = new javax.swing.JScrollPane();
        tbl1 = new javax.swing.JTable();
        jLabel175 = new javax.swing.JLabel();
        txtngaynhap1 = new javax.swing.JTextField();
        jLabel192 = new javax.swing.JLabel();
        txtgia1 = new javax.swing.JTextField();
        jLabel193 = new javax.swing.JLabel();
        txttongtien1 = new javax.swing.JTextField();
        txtmanhap1 = new javax.swing.JLabel();
        btndelete3 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel44 = new javax.swing.JPanel();
        jTabbedPane35 = new javax.swing.JTabbedPane();
        jPanel45 = new javax.swing.JPanel();
        jLabel194 = new javax.swing.JLabel();
        jLabel195 = new javax.swing.JLabel();
        jLabel196 = new javax.swing.JLabel();
        jLabel197 = new javax.swing.JLabel();
        jLabel198 = new javax.swing.JLabel();
        jLabel199 = new javax.swing.JLabel();
        jLabel200 = new javax.swing.JLabel();
        txttensp3 = new javax.swing.JTextField();
        txtngaynhap3 = new javax.swing.JTextField();
        txtsoluong3 = new javax.swing.JTextField();
        txtsize3 = new javax.swing.JTextField();
        txtgia3 = new javax.swing.JTextField();
        btnadd3 = new javax.swing.JButton();
        btnsua3 = new javax.swing.JButton();
        btnxoa3 = new javax.swing.JButton();
        btntimkiem3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl3 = new javax.swing.JTable();
        txtmasp3 = new javax.swing.JLabel();
        cbbdm3 = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        jPanel46 = new javax.swing.JPanel();
        txtmasp4 = new javax.swing.JLabel();
        jLabel203 = new javax.swing.JLabel();
        jLabel204 = new javax.swing.JLabel();
        txttensp4 = new javax.swing.JTextField();
        jLabel205 = new javax.swing.JLabel();
        jLabel206 = new javax.swing.JLabel();
        txtsoluong4 = new javax.swing.JTextField();
        txtsize4 = new javax.swing.JTextField();
        txtgia4 = new javax.swing.JTextField();
        txtngaynhap4 = new javax.swing.JTextField();
        jLabel207 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl4 = new javax.swing.JTable();
        jButton91 = new javax.swing.JButton();
        jButton92 = new javax.swing.JButton();
        jButton93 = new javax.swing.JButton();
        jButton94 = new javax.swing.JButton();
        jLabel214 = new javax.swing.JLabel();
        jLabel201 = new javax.swing.JLabel();
        cbbdm4 = new javax.swing.JComboBox<>();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jPanel47 = new javax.swing.JPanel();
        txtmasp5 = new javax.swing.JLabel();
        jLabel209 = new javax.swing.JLabel();
        jLabel210 = new javax.swing.JLabel();
        txttensp5 = new javax.swing.JTextField();
        jLabel211 = new javax.swing.JLabel();
        jLabel212 = new javax.swing.JLabel();
        txtsoluong5 = new javax.swing.JTextField();
        txtsize5 = new javax.swing.JTextField();
        txtgia5 = new javax.swing.JTextField();
        txtngaynhap5 = new javax.swing.JTextField();
        jLabel213 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbl5 = new javax.swing.JTable();
        jButton95 = new javax.swing.JButton();
        jButton96 = new javax.swing.JButton();
        jButton97 = new javax.swing.JButton();
        jButton98 = new javax.swing.JButton();
        jLabel215 = new javax.swing.JLabel();
        jLabel202 = new javax.swing.JLabel();
        cbbdm5 = new javax.swing.JComboBox<>();
        jButton18 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        radionam6 = new javax.swing.JRadioButton();
        radionu6 = new javax.swing.JRadioButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txttenkh6 = new javax.swing.JTextField();
        txtsdt6 = new javax.swing.JTextField();
        txtdiachi6 = new javax.swing.JTextField();
        txtngaysinh6 = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl6 = new javax.swing.JTable();
        jLabel31 = new javax.swing.JLabel();
        txtngdk6 = new javax.swing.JTextField();
        txtmakh6 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel176 = new javax.swing.JLabel();
        jLabel179 = new javax.swing.JLabel();
        jLabel180 = new javax.swing.JLabel();
        jLabel181 = new javax.swing.JLabel();
        jLabel182 = new javax.swing.JLabel();
        radionam7 = new javax.swing.JRadioButton();
        radionu7 = new javax.swing.JRadioButton();
        jLabel183 = new javax.swing.JLabel();
        jLabel184 = new javax.swing.JLabel();
        jLabel185 = new javax.swing.JLabel();
        jLabel186 = new javax.swing.JLabel();
        txttennv7 = new javax.swing.JTextField();
        txtchucvu7 = new javax.swing.JTextField();
        txtdiachi7 = new javax.swing.JTextField();
        txtcmnd7 = new javax.swing.JTextField();
        txtngaysinh7 = new javax.swing.JTextField();
        txtluongcb7 = new javax.swing.JTextField();
        txtsdt7 = new javax.swing.JTextField();
        txtngaybd7 = new javax.swing.JTextField();
        jButton83 = new javax.swing.JButton();
        jButton84 = new javax.swing.JButton();
        jButton85 = new javax.swing.JButton();
        jButton86 = new javax.swing.JButton();
        txtmanv7 = new javax.swing.JLabel();
        jScrollPane21 = new javax.swing.JScrollPane();
        tbl7 = new javax.swing.JTable();
        jButton19 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txttendm8 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tbl8 = new javax.swing.JTable();
        txtmadm8 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cbb91 = new javax.swing.JComboBox<>();
        cbb92 = new javax.swing.JComboBox<>();
        jScrollPane10 = new javax.swing.JScrollPane();
        tbl9 = new javax.swing.JTable();
        Refresh = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 102));

        jPanel10.setBackground(new java.awt.Color(255, 255, 102));

        jLabel33.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 51, 0));
        jLabel33.setText("CỦA HÀNG QUẦN ÁO FMSTYLE");

        jPanel11.setForeground(new java.awt.Color(255, 255, 255));

        jTabbedPane34.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane34.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jTabbedPane34.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel42.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTabbedPane33.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.lightGray));

        jLabel8.setText("MaDH:");

        jLabel9.setText("Tên Khách hàng:");

        jLabel11.setText("Tên sản phẩm:");

        jLabel12.setText("Số lượng:");

        txtadd2.setText("Tính tiền");
        txtadd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtadd2ActionPerformed(evt);
            }
        });

        btndelete2.setText("Xóa");
        btndelete2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndelete2ActionPerformed(evt);
            }
        });

        btnsua2.setText("Sửa");
        btnsua2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsua2ActionPerformed(evt);
            }
        });

        tbl2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbl2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tbl2AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane2.setViewportView(tbl2);

        jLabel14.setText("Size:");

        jLabel25.setText("Giá");

        txtgia2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtgia2ActionPerformed(evt);
            }
        });

        jLabel189.setText("Tổng tiền:");

        btnsua4.setText("Refresh");
        btnsua4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsua4ActionPerformed(evt);
            }
        });

        jLabel7.setText("Ngày Bán ");

        txtngayban2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtngayban2ActionPerformed(evt);
            }
        });

        jButton10.setText("Tìm kiếm");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(37, 37, 37)
                                    .addComponent(txtgia2, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(14, 14, 14)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txthoten2, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                                        .addComponent(txtmadh2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(49, 49, 49)
                                .addComponent(txtngayban2, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtsoluong2)
                                    .addComponent(txttensp2)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtsize2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(116, 116, 116)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtadd2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnsua2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(btndelete2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel190))
                            .addComponent(btnsua4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 126, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addComponent(jLabel189)
                        .addGap(34, 34, 34)
                        .addComponent(txttongtien2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(198, 198, 198)))
                .addGap(10, 10, 10))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txttensp2, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)))
                    .addComponent(txtmadh2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtsoluong2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtadd2)
                                        .addComponent(btndelete2))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txthoten2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtgia2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtsize2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel190, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(btnsua2)
                                            .addComponent(btnsua4)))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtngayban2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel189, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttongtien2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jButton10)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jTabbedPane33.addTab("Bán Hàng", jPanel5);

        jLabel168.setText("MaNhapHang:");

        jLabel169.setText("TenSanPham:");

        jLabel170.setText("SoLuong:");

        jLabel171.setText("NhaPhanPhoi:");

        btnadd1.setText("Thêm");
        btnadd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadd1jButton1ActionPerformed(evt);
            }
        });

        btnsua1.setText("Sửa");
        btnsua1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsua1ActionPerformed(evt);
            }
        });

        jLabel172.setText("TenDanhMuc:");

        cbbdanhmuc1.setToolTipText("");

        jLabel173.setText("Người giao");

        jLabel174.setText("Người Nhận");

        txtnguoigiao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnguoigiao1jTextField5ActionPerformed(evt);
            }
        });

        btndelete1.setText("Xóa");
        btndelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndelete1jButton3ActionPerformed(evt);
            }
        });

        tbl1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbl1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tbl1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane19.setViewportView(tbl1);

        jLabel175.setText("Ngày nhập:");

        txtngaynhap1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtngaynhap1jTextField19ActionPerformed(evt);
            }
        });

        jLabel192.setText("Giá:");

        jLabel193.setText("Tổng tiền:");

        txttongtien1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttongtien1jTextField19ActionPerformed(evt);
            }
        });

        btndelete3.setText("Refresh");
        btndelete3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndelete3jButton3ActionPerformed(evt);
            }
        });

        jButton8.setText("Tìm Kiếm");

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addComponent(jScrollPane19)
                        .addContainerGap())
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addComponent(jLabel174, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbbnguoinhan1, 0, 179, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel43Layout.createSequentialGroup()
                                .addComponent(jLabel192, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(txtgia1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel43Layout.createSequentialGroup()
                                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel172, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                                    .addComponent(jLabel168, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel169, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbbdanhmuc1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txttensp1)
                                    .addComponent(txtmanhap1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(105, 105, 105)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addComponent(jLabel193, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txttongtien1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(84, 154, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel43Layout.createSequentialGroup()
                                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel43Layout.createSequentialGroup()
                                        .addComponent(jLabel175, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtngaynhap1))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel43Layout.createSequentialGroup()
                                        .addComponent(jLabel173, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtnguoigiao1))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel43Layout.createSequentialGroup()
                                        .addComponent(jLabel170, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtsoluong1))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel43Layout.createSequentialGroup()
                                        .addComponent(jLabel171, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtnhaphanphoi1)))
                                .addGap(81, 81, 81)))
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnadd1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btndelete1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btndelete3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnsua1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(50, 50, 50))))
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel168, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel170, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtsoluong1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtmanhap1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel169, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txttensp1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel171, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtnhaphanphoi1))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel172, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbbdanhmuc1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel173, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtnguoigiao1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel174, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbbnguoinhan1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel175, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtngaynhap1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel192, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtgia1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel193, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttongtien1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton8))
                        .addGap(82, 82, 82))
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnadd1)
                            .addComponent(btnsua1))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btndelete1)
                            .addComponent(btndelete3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane33.addTab("Nhập hàng", jPanel43);

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addComponent(jTabbedPane33, javax.swing.GroupLayout.PREFERRED_SIZE, 1197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane33)
        );

        jTabbedPane34.addTab("Đơn Hàng", jPanel42);

        jLabel194.setText("MaSP:");

        jLabel195.setText("Tên sản phẩm:");

        jLabel196.setText("Tên danh mục:");

        jLabel197.setText("Ngày nhập:");

        jLabel198.setText("Số lượng còn:");

        jLabel199.setText("Size:");

        jLabel200.setText("Giá bán:");

        btnadd3.setText("Thêm");
        btnadd3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadd3ActionPerformed(evt);
            }
        });

        btnsua3.setText("Sửa");
        btnsua3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsua3ActionPerformed(evt);
            }
        });

        btnxoa3.setText("Xóa");
        btnxoa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoa3ActionPerformed(evt);
            }
        });

        btntimkiem3.setText("Tìm kiếm");

        tbl3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl3.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tbl3AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(tbl3);

        jButton6.setText("Refresh");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel45Layout.createSequentialGroup()
                        .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel196)
                            .addComponent(jLabel197))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtngaynhap3, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel45Layout.createSequentialGroup()
                                .addComponent(cbbdm3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(1, 1, 1))))
                    .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel45Layout.createSequentialGroup()
                            .addComponent(jLabel194, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtmasp3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel45Layout.createSequentialGroup()
                            .addComponent(jLabel195)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txttensp3, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(89, 89, 89)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel45Layout.createSequentialGroup()
                        .addComponent(jLabel198, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtsoluong3, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel45Layout.createSequentialGroup()
                        .addComponent(jLabel199, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtsize3, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel45Layout.createSequentialGroup()
                        .addComponent(jLabel200, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtgia3, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btntimkiem3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnadd3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnxoa3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel45Layout.createSequentialGroup()
                        .addComponent(btnsua3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel194, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel198, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsoluong3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmasp3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnadd3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel195, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel199, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txttensp3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtsize3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnsua3)
                        .addComponent(jButton6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel196, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel200, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtgia3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btnxoa3, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(cbbdm3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel45Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btntimkiem3)
                        .addGap(32, 32, 32))
                    .addGroup(jPanel45Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel197, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtngaynhap3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        jTabbedPane35.addTab("Áo", jPanel45);

        jLabel203.setText("MaSP:");

        jLabel204.setText("Tên sản phẩm:");

        jLabel205.setText("Số lượng còn:");

        jLabel206.setText("Size:");

        jLabel207.setText("Ngày nhập:");

        tbl4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl4.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tbl4AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane4.setViewportView(tbl4);

        jButton91.setText("Xóa");
        jButton91.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton91ActionPerformed(evt);
            }
        });

        jButton92.setText("Thêm");
        jButton92.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton92ActionPerformed(evt);
            }
        });

        jButton93.setText("Sửa");
        jButton93.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton93ActionPerformed(evt);
            }
        });

        jButton94.setText("Tìm kiếm");

        jLabel214.setText("Tên danh mục:");

        jLabel201.setText("Giá bán:");

        jButton15.setText("Refresh");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setText("Refresh");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setText("Refresh");

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel46Layout.createSequentialGroup()
                        .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel46Layout.createSequentialGroup()
                                .addComponent(jLabel207)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtngaynhap4, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel46Layout.createSequentialGroup()
                                .addComponent(jLabel203, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtmasp4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel46Layout.createSequentialGroup()
                                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel46Layout.createSequentialGroup()
                                        .addComponent(jLabel204)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txttensp4, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel46Layout.createSequentialGroup()
                                        .addComponent(jLabel214)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbbdm4, 0, 311, Short.MAX_VALUE)))
                                .addGap(0, 4, Short.MAX_VALUE)))
                        .addGap(89, 89, 89)
                        .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel46Layout.createSequentialGroup()
                                .addComponent(jLabel205, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtsoluong4, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton92, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton94, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel46Layout.createSequentialGroup()
                                        .addComponent(jLabel201, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtgia4, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton91, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel46Layout.createSequentialGroup()
                                        .addComponent(jLabel206, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtsize4, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(77, 77, 77)
                                        .addComponent(jButton93, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 15, Short.MAX_VALUE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(10, 10, 10))
            .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel46Layout.createSequentialGroup()
                    .addGap(550, 550, 550)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(551, Short.MAX_VALUE)))
            .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel46Layout.createSequentialGroup()
                    .addContainerGap(560, Short.MAX_VALUE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(541, 541, 541)))
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel46Layout.createSequentialGroup()
                        .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel46Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel203, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel205, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtsoluong4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtmasp4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel204, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel206, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txttensp4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtsize4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel46Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jButton92)
                                .addGap(18, 18, 18)
                                .addComponent(jButton93)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtgia4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton91)
                            .addComponent(jLabel214, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel201, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbbdm4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel46Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jButton17)))
                .addGap(18, 18, 18)
                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel207, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtngaynhap4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton94))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel46Layout.createSequentialGroup()
                    .addGap(246, 246, 246)
                    .addComponent(jButton15)
                    .addContainerGap(246, Short.MAX_VALUE)))
            .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel46Layout.createSequentialGroup()
                    .addContainerGap(256, Short.MAX_VALUE)
                    .addComponent(jButton16)
                    .addGap(236, 236, 236)))
        );

        jTabbedPane35.addTab("Quần", jPanel46);

        jLabel209.setText("MaSP:");

        jLabel210.setText("Tên sản phẩm:");

        jLabel211.setText("Số lượng còn:");

        jLabel212.setText("Size:");

        jLabel213.setText("Ngày nhập:");

        tbl5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl5.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tbl5AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane5.setViewportView(tbl5);

        jButton95.setText("Xóa");

        jButton96.setText("Thêm");
        jButton96.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton96ActionPerformed(evt);
            }
        });

        jButton97.setText("Sửa");
        jButton97.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton97ActionPerformed(evt);
            }
        });

        jButton98.setText("Tìm kiếm");

        jLabel215.setText("Tên danh mục:");

        jLabel202.setText("Giá bán:");

        jButton18.setText("Refresh");

        javax.swing.GroupLayout jPanel47Layout = new javax.swing.GroupLayout(jPanel47);
        jPanel47.setLayout(jPanel47Layout);
        jPanel47Layout.setHorizontalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel47Layout.createSequentialGroup()
                        .addComponent(jScrollPane5)
                        .addGap(10, 10, 10))
                    .addGroup(jPanel47Layout.createSequentialGroup()
                        .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel47Layout.createSequentialGroup()
                                    .addComponent(jLabel209, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtmasp5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel47Layout.createSequentialGroup()
                                    .addComponent(jLabel210)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txttensp5, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel47Layout.createSequentialGroup()
                                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel213)
                                    .addComponent(jLabel215))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtngaynhap5, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbbdm5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(88, 88, 88)
                        .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel47Layout.createSequentialGroup()
                                .addComponent(jLabel211, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtsoluong5, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton96, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel47Layout.createSequentialGroup()
                                .addComponent(jLabel202, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtgia5, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton95, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel47Layout.createSequentialGroup()
                                .addComponent(jLabel212, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtsize5, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)
                                .addComponent(jButton97, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton98, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
        );
        jPanel47Layout.setVerticalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel209, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel211, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtsoluong5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtmasp5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton96, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel47Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel210, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel212, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttensp5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtsize5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton97))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtgia5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel215, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel202, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton95)
                            .addComponent(cbbdm5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel47Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jButton18)))
                .addGap(18, 18, 18)
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel213, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtngaynhap5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton98))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane35.addTab("Thời trang khác", jPanel47);

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addComponent(jTabbedPane35)
                .addContainerGap())
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addComponent(jTabbedPane35, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        jTabbedPane34.addTab("Quản lí sản phẩm", jPanel44);

        jLabel15.setText("MaKH:");

        jLabel16.setText("Tên khách hàng:");

        jLabel17.setText("SĐT:");

        jLabel18.setText("Địa chỉ :");

        buttonGroup1.add(radionam6);
        radionam6.setText("Nam");
        radionam6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radionam6ActionPerformed(evt);
            }
        });

        buttonGroup1.add(radionu6);
        radionu6.setText("Nữ");
        radionu6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radionu6ActionPerformed(evt);
            }
        });

        jLabel19.setText("Giới tính:");

        jLabel20.setText("Ngày sinh:");

        txtsdt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsdt6ActionPerformed(evt);
            }
        });

        jButton11.setLabel("Thêm ");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setLabel("Sửa");

        jButton13.setLabel("Xóa");

        jButton14.setText("Refresh");

        tbl6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl6.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbl6.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tbl6AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane3.setViewportView(tbl6);

        jLabel31.setText("Ngày Đăng ký:");

        jButton7.setText("Tìm kiếm");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtsdt6)
                                    .addComponent(txtdiachi6)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txttenkh6, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtmakh6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtngaysinh6)
                                        .addGap(52, 52, 52))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel31)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtngdk6)
                                        .addGap(51, 51, 51))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                        .addGap(29, 29, 29)
                                        .addComponent(radionam6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(radionu6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(204, 204, 204)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(92, 92, 92)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(108, 108, 108))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radionam6)
                            .addComponent(radionu6)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtmakh6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 13, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txttenkh6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtngaysinh6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton11)
                            .addComponent(jButton12))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsdt6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtngdk6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton13)
                        .addComponent(jButton14)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdiachi6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jTabbedPane34.addTab("Quản Lí Khách Hàng", jPanel2);

        jLabel28.setText("MaNV");

        jLabel176.setText("Họ tên nhân viên:");

        jLabel179.setText("Chức vụ:");

        jLabel180.setText("Địa chỉ:");

        jLabel181.setText("SĐT:");

        jLabel182.setText("Giới tính:");

        buttonGroup2.add(radionam7);
        radionam7.setText("Nam");
        radionam7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radionam7ActionPerformed(evt);
            }
        });

        buttonGroup2.add(radionu7);
        radionu7.setText("Nữ");
        radionu7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radionu7ActionPerformed(evt);
            }
        });

        jLabel183.setText("Ngày sinh:");

        jLabel184.setText("Lương cơ bản:");

        jLabel185.setText("CMND:");

        jLabel186.setText("Ngày bắt đầu:");

        txttennv7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttennv7ActionPerformed(evt);
            }
        });

        txtngaysinh7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtngaysinh7ActionPerformed(evt);
            }
        });

        txtluongcb7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtluongcb7ActionPerformed(evt);
            }
        });

        txtsdt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsdt7ActionPerformed(evt);
            }
        });

        txtngaybd7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtngaybd7ActionPerformed(evt);
            }
        });

        jButton83.setText("Thêm");

        jButton84.setText("Sửa");

        jButton85.setText("Xóa");

        jButton86.setText("Tìm kiếm");

        tbl7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl7.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbl7.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tbl7AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane21.setViewportView(tbl7);

        jButton19.setText("Refresh");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jScrollPane21)
                        .addContainerGap())
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtmanv7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel179)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtchucvu7))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel180)
                                .addGap(18, 18, 18)
                                .addComponent(txtdiachi7))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel185)
                                .addGap(18, 18, 18)
                                .addComponent(txtcmnd7))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel176)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txttennv7, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(72, 72, 72)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel186)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtngaybd7, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel182, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radionam7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radionu7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel183)
                                .addGap(18, 18, 18)
                                .addComponent(txtngaysinh7))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel184)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                        .addComponent(jLabel181, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35)))
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtluongcb7, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtsdt7, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton83, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton85, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton84, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton86, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(121, 121, 121))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radionam7)
                    .addComponent(radionu7)
                    .addComponent(jLabel182, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmanv7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel176, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel183, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttennv7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtngaysinh7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel179, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel184, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtchucvu7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtluongcb7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel180, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel181, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdiachi7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtsdt7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel185, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel186, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcmnd7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtngaybd7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton83, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton84, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton85, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton86, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane21, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        jTabbedPane34.addTab("Quản lí nhân viên", jPanel7);

        jLabel1.setText("Tên danh mục: ");

        jLabel2.setText("MaDanhMuc: ");

        txttendm8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttendm8ActionPerformed(evt);
            }
        });

        jButton1.setText("Thêm");

        jButton2.setText("Sửa");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Xóa");

        jButton4.setText("Tìm Kiếm");

        jButton9.setText("Refresh");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        tbl8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl8.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbl8.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbl8.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tbl8AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane6.setViewportView(tbl8);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(235, 235, 235)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(225, 225, 225)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txttendm8, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtmadm8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(143, 143, 143))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtmadm8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txttendm8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jButton1)
                        .addGap(44, 44, 44)
                        .addComponent(jButton2)
                        .addGap(60, 60, 60)
                        .addComponent(jButton3)
                        .addGap(54, 54, 54)
                        .addComponent(jButton4)
                        .addGap(58, 58, 58)
                        .addComponent(jButton9)))
                .addGap(85, 85, 85))
        );

        jTabbedPane34.addTab("Danh mục sản phẩm", jPanel1);

        jLabel10.setText("Tháng");

        jLabel13.setText("Năm");

        cbb91.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2015", "2016", "2017", "2018", "2019", "2020", "2021", " " }));
        cbb91.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbb91ActionPerformed(evt);
            }
        });

        cbb92.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        cbb92.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbb92ActionPerformed(evt);
            }
        });

        tbl9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane10.setViewportView(tbl9);

        Refresh.setText("Refresh");
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cbb91, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cbb92, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 396, Short.MAX_VALUE)
                .addComponent(Refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane10)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(cbb91, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbb92, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Refresh))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jTabbedPane34.addTab("Thống kê", jPanel12);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane34, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane34, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jTabbedPane34.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(466, 466, 466)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(482, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(159, 159, 159))
        );

        jButton5.setText("Thoát");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 611, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void txtngaybd7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtngaybd7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtngaybd7ActionPerformed

    private void txtsdt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsdt7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsdt7ActionPerformed

    private void txtluongcb7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtluongcb7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtluongcb7ActionPerformed

    private void txtngaysinh7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtngaysinh7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtngaysinh7ActionPerformed

    private void txttennv7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttennv7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttennv7ActionPerformed

    private void radionu7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radionu7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radionu7ActionPerformed

    private void radionam7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radionam7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radionam7ActionPerformed

    private void txtsdt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsdt6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsdt6ActionPerformed

    private void radionu6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radionu6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radionu6ActionPerformed

    private void radionam6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radionam6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radionam6ActionPerformed

    private void btndelete2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndelete2ActionPerformed
        // TODO add your handling code here:
        
         int row = tbl2.getSelectedRow();
        if (row == -1){
            JOptionPane.showMessageDialog(this,"Vui lòng chon đơn hàng muốn xóa","Loi", JOptionPane.ERROR_MESSAGE );
        }else
        {
            int confident = JOptionPane.showConfirmDialog(this, "Ban co chac muon xoa user nay khong!");
            if (confident == JOptionPane.YES_OPTION) {
                String id = String.valueOf(tbl2.getValueAt(row, 1));
                userBH.remove( id);
                defaultTableModel2.setRowCount(0);
                
                
            }
            
        }
    }//GEN-LAST:event_btndelete2ActionPerformed

    private void txttongtien1jTextField19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttongtien1jTextField19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttongtien1jTextField19ActionPerformed

    private void txtngaynhap1jTextField19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtngaynhap1jTextField19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtngaynhap1jTextField19ActionPerformed

    private void btndelete1jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndelete1jButton3ActionPerformed
        // TODO add your handling code here:
        int row = tbl1.getSelectedRow();
        if (row == -1){
            JOptionPane.showMessageDialog(this,"Vui long chon nguoi dung can xoa","Loi", JOptionPane.ERROR_MESSAGE );
        }else
        {
            int confident = JOptionPane.showConfirmDialog(this, "Ban co chac muon xoa user nay khong!");
            if (confident == JOptionPane.YES_OPTION) {
                String id = String.valueOf(tbl1.getValueAt(row, 1));
                userNH.remove( id);
                defaultTableModel1.setRowCount(0);
                
                
            }
            
        }
        
        
    }//GEN-LAST:event_btndelete1jButton3ActionPerformed

    private void txtnguoigiao1jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnguoigiao1jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnguoigiao1jTextField5ActionPerformed

    private void btnadd1jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadd1jButton1ActionPerformed
        // TODO add your handling code here:
    NhapHang hang = new NhapHang(txtmanhap1.getText(),txttensp1.getText(), String.valueOf(cbbdanhmuc1.getSelectedItem()), String.valueOf(cbbnguoinhan1.getSelectedItem()), Integer.valueOf(txtgia1.getText()), Integer.valueOf(txtsoluong1.getText()),
            txtnhaphanphoi1.getText(), txtnguoigiao1.getText(), txtngaynhap1.getText(), Integer.valueOf(txttongtien1.getText()));
        userNH.insert(hang);
        defaultTableModel1.setRowCount(0);
        int stttbl1=0;
        List<NhapHang> user_NH = userNH.getAll();
        for(NhapHang users : user_NH){
            stttbl1++;
            defaultTableModel1.addRow(new Object[]{stttbl1, users.getMaNH(),users.getTenSP(),users.getTenDM(),users.getNguoiNhan(),users.getGia(),
            users.getSoLuong(),users.getNhaPhanPhoi(),users.getNguoiGiao(),users.getNgayNhap(),users.getTongTien()});
        }
    }//GEN-LAST:event_btnadd1jButton1ActionPerformed

    private void txtgia2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtgia2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtgia2ActionPerformed

    private void txttendm8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttendm8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttendm8ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton97ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton97ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton97ActionPerformed

    private void jButton93ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton93ActionPerformed
        // TODO add your handling code here:
           QuanLiQuan quanLiQuan = new QuanLiQuan(txtmasp4.getText(),txttensp4.getText(),String.valueOf(cbbdm4.getSelectedItem()) ,txtsize4.getText() , Integer.valueOf(txtsoluong4.getText()),Integer.valueOf(txtgia4.getText()) ,
                                txtngaynhap4.getText());
       userQuan.update(quanLiQuan);
       defaultTableModel4.setRowCount(0);
       int stttbl3=0;
        List<QuanLiQuan> user_Quan = userQuan.getAll();
        for(QuanLiQuan users :user_Quan){
            stttbl3++;
            defaultTableModel4.addRow(new Object[]{stttbl3,users.getMaSP(),users.getTenSP(),users.getTenDM(),users.getSize(),users.getSoLuong(),users.getGiaBan(),users.getNgayNhap()});
        }
    }//GEN-LAST:event_jButton93ActionPerformed

    private void btnsua3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsua3ActionPerformed
        // TODO add your handling code here:
          QuanLiAo quanLiAo = new QuanLiAo(txtmasp3.getText(),txttensp3.getText(), String.valueOf(cbbdm3.getSelectedItem()),txtsize3.getText() , Integer.valueOf(txtsoluong3.getText()),Integer.valueOf(txtgia3.getText()) ,
                                txtngaynhap3.getText());
       userAo.update(quanLiAo);
       defaultTableModel3.setRowCount(0);
       int stttbl3=0;
        List<QuanLiAo> user_AO = userAo.getAll();
        for(QuanLiAo users :user_AO){
            stttbl3++;
            defaultTableModel3.addRow(new Object[]{stttbl3,users.getMaSP(),users.getTenSP(),users.getTenDM(),users.getSize(),users.getSoLuong(),users.getGiaBan(),users.getNgayNhap()});
        }
    }//GEN-LAST:event_btnsua3ActionPerformed

    private void tbl1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tbl1AncestorAdded
        // TODO add your handling code here:
        ListSelectionModel listSelectionModel = tbl1.getSelectionModel();
        listSelectionModel.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int row = tbl1.getSelectedRow();
                txtmanhap1.setText(String.valueOf(tbl1.getValueAt(row, 1)));
                txttensp1.setText(String.valueOf(tbl1.getValueAt(row, 2)));
                cbbdanhmuc1.setSelectedItem(String.valueOf(tbl1.getValueAt(row, 3)));
                cbbnguoinhan1.setSelectedItem(String.valueOf(tbl1.getValueAt(row, 4)));
                txtgia1.setText(String.valueOf(tbl1.getValueAt(row, 5)));
                txtsoluong1.setText(String.valueOf(tbl1.getValueAt(row, 6)));
                txtnhaphanphoi1.setText(String.valueOf(tbl1.getValueAt(row, 7)));
                txtnguoigiao1.setText(String.valueOf(tbl1.getValueAt(row, 8)));
                txtngaynhap1.setText(String.valueOf(tbl1.getValueAt(row, 9)));
                txttongtien1.setText(String.valueOf(tbl1.getValueAt(row, 10)));
              
            }
        });
    }//GEN-LAST:event_tbl1AncestorAdded

    private void btndelete3jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndelete3jButton3ActionPerformed
        // TODO add your handling code here:
        txtmanhap1.setText("");
        txttensp1.setText("");
        txtgia1.setText("");
        txtsoluong1.setText("");
        txtnhaphanphoi1.setText("");
        txtnguoigiao1.setText("");
        txtngaynhap1.setText("");
        txttongtien1.setText("");
        cbbdanhmuc1.removeAllItems();
        cbbnguoinhan1.removeAllItems();
        List<NhanVien> user_NV = userNV.getAll();
        for(NhanVien users : user_NV){
            cbbnguoinhan1.addItem(users.getHoTen());
        }
        List<DanhMucSanPham> user_DM = userDM.getAll();
        for(DanhMucSanPham users : user_DM){
            cbbdanhmuc1.addItem(users.getTenDM());
        }
         defaultTableModel1.setRowCount(0);
        int stttbl1=0;
        List<NhapHang> user_NH = userNH.getAll();
        for(NhapHang users : user_NH){
            stttbl1++;
            defaultTableModel1.addRow(new Object[]{stttbl1, users.getMaNH(),users.getTenSP(),users.getTenDM(),users.getNguoiNhan(),users.getGia(),
            users.getSoLuong(),users.getNhaPhanPhoi(),users.getNguoiGiao(),users.getNgayNhap(),users.getTongTien()});
        }
    }//GEN-LAST:event_btndelete3jButton3ActionPerformed

    private void btnsua1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsua1ActionPerformed
        // TODO add your handling code here:
         NhapHang hang = new NhapHang(txtmanhap1.getText(),txttensp1.getText(), String.valueOf(cbbdanhmuc1.getSelectedItem()), String.valueOf(cbbnguoinhan1.getSelectedItem()), Integer.valueOf(txtgia1.getText()), Integer.valueOf(txtsoluong1.getText()),
            txtnhaphanphoi1.getText(), txtnguoigiao1.getText(), txtngaynhap1.getText(), Integer.valueOf(txttongtien1.getText()));
        userNH.update(hang);
        defaultTableModel1.setRowCount(0);
        int stttbl1=0;
        List<NhapHang> user_NH = userNH.getAll();
        for(NhapHang users : user_NH){
            stttbl1++;
            defaultTableModel1.addRow(new Object[]{stttbl1, users.getMaNH(),users.getTenSP(),users.getTenDM(),users.getNguoiNhan(),users.getGia(),
            users.getSoLuong(),users.getNhaPhanPhoi(),users.getNguoiGiao(),users.getNgayNhap(),users.getTongTien()});
        }
    }//GEN-LAST:event_btnsua1ActionPerformed

    private void jButton96ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton96ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton96ActionPerformed

    private void btnadd3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadd3ActionPerformed
        // TODO add your handling code here:
        
       QuanLiAo quanLiAo = new QuanLiAo(txtmasp3.getText(),txttensp3.getText(),String.valueOf(cbbdm3.getSelectedItem()),txtsize3.getText() , Integer.valueOf(txtsoluong3.getText()),Integer.valueOf(txtgia3.getText()) ,
                                txtngaynhap3.getText());
       userAo.insert(quanLiAo);
       defaultTableModel3.setRowCount(0);
       int stttbl3=0;
        List<QuanLiAo> user_AO = userAo.getAll();
        for(QuanLiAo users :user_AO){
            stttbl3++;
            defaultTableModel3.addRow(new Object[]{stttbl3,users.getMaSP(),users.getTenSP(),users.getTenDM(),users.getSize(),users.getSoLuong(),users.getGiaBan(),users.getNgayNhap()});
        }
    }//GEN-LAST:event_btnadd3ActionPerformed

    private void btnxoa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoa3ActionPerformed
        // TODO add your handling code here:
         int row = tbl3.getSelectedRow();
        if (row == -1){
            JOptionPane.showMessageDialog(this,"Vui lòng chọn Sản phẩm muốn xóa","Loi", JOptionPane.ERROR_MESSAGE );
        }else
        {
            int confident = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn xóa sản phẩm này không!");
            if (confident == JOptionPane.YES_OPTION) {
                String id = String.valueOf(tbl3.getValueAt(row, 1));
                userAo.remove( id);
                defaultTableModel3.setRowCount(0);
                
                
            }
            
        }
        
    }//GEN-LAST:event_btnxoa3ActionPerformed

    private void tbl2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tbl2AncestorAdded
        // TODO add your handling code here:
        ListSelectionModel listSelectionModel = tbl2.getSelectionModel();
        listSelectionModel.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int row = tbl2.getSelectedRow();
                txtmadh2.setText(String.valueOf(tbl2.getValueAt(row, 1)));
                txttensp2.setText(String.valueOf(tbl2.getValueAt(row, 3)));
                txtgia2.setText(String.valueOf(tbl2.getValueAt(row, 4)));
                txtsoluong2.setText(String.valueOf(tbl2.getValueAt(row, 5)));
                txthoten2.setText(String.valueOf(tbl2.getValueAt(row, 2)));
                txtsize2.setText(String.valueOf(tbl2.getValueAt(row, 6)));
                txtngayban2.setText(String.valueOf(tbl2.getValueAt(row, 7)));
                txttongtien2.setText(String.valueOf(tbl2.getValueAt(row, 8)));
              
            }
        });
        
    }//GEN-LAST:event_tbl2AncestorAdded

    private void txtadd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtadd2ActionPerformed
        // TODO add your handling code here:
        int tongtien=Integer.valueOf(txtsoluong2.getText())*Integer.valueOf(txtgia2.getText());
        txttongtien2.setText(String.valueOf(tongtien));
        BanHang banHang = new BanHang(txtmadh2.getText(), txthoten2.getText(), txttensp2.getText(), Integer.valueOf(txtgia2.getText()), Integer.valueOf(txtsoluong2.getText()),
                txtsize2.getText(),txtngayban2.getText(), Integer.valueOf(txttongtien2.getText()));
        userBH.insert(banHang);
        defaultTableModel2.setRowCount(0);
         int stttbl2 =0;
        List<BanHang> user_BH = userBH.getAll();
        for(BanHang users : user_BH){
            stttbl2++;
            defaultTableModel2.addRow(new Object[]{stttbl2,users.getMaDH(),users.getHotenKH(),users.getTenSP(),users.getGia(),users.getSoLuong(),users.getSize(),users.getNgayBan(),users.getTongTien()});
        }
    }//GEN-LAST:event_txtadd2ActionPerformed

    private void btnsua2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsua2ActionPerformed
        // TODO add your handling code here:
        txttongtien2.setText(String.valueOf(Integer.valueOf(txtsoluong2.getText())*Integer.valueOf(txtgia2.getText())));
        BanHang banHang = new BanHang(txtmadh2.getText(), txthoten2.getText(), txttensp2.getText(), Integer.valueOf(txtgia2.getText()), Integer.valueOf(txtsoluong2.getText()),
                txtsize2.getText(),txtngayban2.getText(), Integer.valueOf(txttongtien2.getText()));
        userBH.update(banHang);
        defaultTableModel2.setRowCount(0);
         int stttbl2 =0;
        List<BanHang> user_BH = userBH.getAll();
        for(BanHang users : user_BH){
            stttbl2++;
            defaultTableModel2.addRow(new Object[]{stttbl2,users.getMaDH(),users.getHotenKH(),users.getTenSP(),users.getGia(),users.getSoLuong(),users.getSize(),users.getNgayBan(),users.getTongTien()});
        }
    }//GEN-LAST:event_btnsua2ActionPerformed

    private void jButton92ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton92ActionPerformed
        // TODO add your handling code here:
         QuanLiQuan quanLiQuan = new QuanLiQuan(txtmasp4.getText(),txttensp4.getText(), String.valueOf(cbbdm4.getSelectedItem()),txtsize4.getText() , Integer.valueOf(txtsoluong4.getText()),Integer.valueOf(txtgia4.getText()) ,
                                txtngaynhap4.getText());
       userQuan.insert(quanLiQuan);
       defaultTableModel4.setRowCount(0);
       int stttbl3=0;
        List<QuanLiQuan> user_Quan = userQuan.getAll();
        for(QuanLiQuan users :user_Quan){
            stttbl3++;
            defaultTableModel4.addRow(new Object[]{stttbl3,users.getMaSP(),users.getTenSP(),users.getTenDM(),users.getSize(),users.getSoLuong(),users.getGiaBan(),users.getNgayNhap()});
        }
    }//GEN-LAST:event_jButton92ActionPerformed

    private void jButton91ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton91ActionPerformed
        // TODO add your handling code here:
        
         int row = tbl4.getSelectedRow();
        if (row == -1){
            JOptionPane.showMessageDialog(this,"Vui lòng chọn Sản phẩm muốn xóa","Loi", JOptionPane.ERROR_MESSAGE );
        }else
        {
            int confident = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn xóa sản phẩm này không!");
            if (confident == JOptionPane.YES_OPTION) {
                String id = String.valueOf(tbl4.getValueAt(row, 1));
                userQuan.remove( id);
                defaultTableModel4.setRowCount(0);
                
                
            }
            
        }
        
    }//GEN-LAST:event_jButton91ActionPerformed

    private void btnsua4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsua4ActionPerformed
        // TODO add your handling code here:
        
        txtmadh2.setText("");
        txttensp2.setText("");
        txthoten2.setText("");
        txtgia2.setText("");
        txtsoluong2.setText("");
        txttongtien2.setText("");
        txtsize2.setText("");
        txtngayban2.setText("");
        defaultTableModel2.setRowCount(0);
        int stttbl2 =0;
        List<BanHang> user_BH = userBH.getAll();
        for(BanHang users : user_BH){
            stttbl2++;
            defaultTableModel2.addRow(new Object[]{stttbl2,users.getMaDH(),users.getHotenKH(),users.getTenSP(),users.getGia(),users.getSoLuong(),users.getSize(),users.getNgayBan(),users.getTongTien()});
        }
    }//GEN-LAST:event_btnsua4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        
        txtmasp3.setText("");
        txttensp3.setText("");
        cbbdm3.removeAllItems();
        List<DanhMucSanPham> user_DM = userDM.getAll();
        for(DanhMucSanPham users :user_DM){
            cbbdm3.addItem(users.getTenDM());
        }
        txtngaynhap3.setText("");
        txtsoluong3.setText("");
        txtgia3.setText("");
        txtsize3.setText("");
        defaultTableModel3.setRowCount(0);
        int stt=0;
        List<QuanLiAo> user_ao = userAo.getAll();
        for(QuanLiAo users : user_ao){
            stt++;
            defaultTableModel3.addRow(new Object[]{stt,users.getMaSP(),users.getTenSP(),users.getTenDM(),users.getSize(),users.getSoLuong(),users.getGiaBan(),users.getNgayNhap()});
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void tbl3AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tbl3AncestorAdded
        // TODO add your handling code here:
         ListSelectionModel listSelectionModel = tbl3.getSelectionModel();
        listSelectionModel.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int row = tbl3.getSelectedRow();
                txtmasp3.setText(String.valueOf(tbl3.getValueAt(row, 1)));
                txttensp3.setText(String.valueOf(tbl3.getValueAt(row, 2)));
                cbbdm3.setSelectedItem(String.valueOf(tbl3.getValueAt(row, 3)));
               txtsize3.setText(String.valueOf(tbl3.getValueAt(row, 4)));
                txtsoluong3.setText(String.valueOf(tbl3.getValueAt(row, 5)));
                txtgia3.setText(String.valueOf(tbl3.getValueAt(row, 6)));
                txtngaynhap3.setText(String.valueOf(tbl3.getValueAt(row, 7)));
                
              
            }
        });
    }//GEN-LAST:event_tbl3AncestorAdded

    private void tbl4AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tbl4AncestorAdded
        // TODO add your handling code here:
             ListSelectionModel listSelectionModel = tbl4.getSelectionModel();
        listSelectionModel.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int row = tbl4.getSelectedRow();
                txtmasp4.setText(String.valueOf(tbl4.getValueAt(row, 1)));
                txttensp4.setText(String.valueOf(tbl4.getValueAt(row, 2)));
                cbbdm4.setSelectedItem(String.valueOf(tbl4.getValueAt(row, 3)));
               txtsize4.setText(String.valueOf(tbl4.getValueAt(row, 4)));
                txtsoluong4.setText(String.valueOf(tbl4.getValueAt(row, 5)));
                txtgia4.setText(String.valueOf(tbl4.getValueAt(row, 6)));
                txtngaynhap4.setText(String.valueOf(tbl4.getValueAt(row, 7)));
                
              
            }
        });
    }//GEN-LAST:event_tbl4AncestorAdded

    private void tbl5AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tbl5AncestorAdded
        // TODO add your handling code here:
             ListSelectionModel listSelectionModel = tbl5.getSelectionModel();
        listSelectionModel.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int row = tbl5.getSelectedRow();
                txtmasp5.setText(String.valueOf(tbl5.getValueAt(row, 1)));
                txttensp5.setText(String.valueOf(tbl5.getValueAt(row, 2)));
                cbbdm5.setSelectedItem(String.valueOf(tbl5.getValueAt(row, 3)));
               txtsize5.setText(String.valueOf(tbl5.getValueAt(row, 4)));
                txtsoluong5.setText(String.valueOf(tbl5.getValueAt(row, 5)));
                txtgia5.setText(String.valueOf(tbl5.getValueAt(row, 6)));
                txtngaynhap5.setText(String.valueOf(tbl5.getValueAt(row, 7)));
                
              
            }
        });
    }//GEN-LAST:event_tbl5AncestorAdded

    private void tbl6AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tbl6AncestorAdded
        // TODO add your handling code here:
             ListSelectionModel listSelectionModel = tbl6.getSelectionModel();
        listSelectionModel.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int row = tbl6.getSelectedRow();
                txtmakh6.setText(String.valueOf(tbl6.getValueAt(row, 1)));
                txttenkh6.setText(String.valueOf(tbl6.getValueAt(row, 2)));
                String gioitinh =String.valueOf(tbl6.getValueAt(row, 3));
                if (gioitinh.equals("Nam")){
                    radionam6.setSelected(true);
                }
                else
                    radionu6.setSelected(true);
                txtngaysinh6.setText(String.valueOf(tbl6.getValueAt(row, 4)));
                txtdiachi6.setText(String.valueOf(tbl6.getValueAt(row, 5)));
                txtsdt6.setText(String.valueOf(tbl6.getValueAt(row, 6)));
                txtngdk6.setText(String.valueOf(tbl6.getValueAt(row, 7)));
                
                
              
            }
        });
    }//GEN-LAST:event_tbl6AncestorAdded

    private void tbl7AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tbl7AncestorAdded
        // TODO add your handling code here:
             ListSelectionModel listSelectionModel = tbl7.getSelectionModel();
        listSelectionModel.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int row = tbl7.getSelectedRow();
                txtmanv7.setText(String.valueOf(tbl7.getValueAt(row, 1)));
                txttennv7.setText(String.valueOf(tbl7.getValueAt(row, 2)));
                String gioitinh =String.valueOf(tbl7.getValueAt(row, 3));
                if(gioitinh.equals("Nam")){
                    radionam7.setSelected(true);
                }
                else
                    radionu7.setSelected(true);
                txtdiachi7.setText(String.valueOf(tbl7.getValueAt(row, 5)));
                txtchucvu7.setText(String.valueOf(tbl7.getValueAt(row, 6)));
                txtluongcb7.setText(String.valueOf(tbl7.getValueAt(row, 7)));
                txtcmnd7.setText(String.valueOf(tbl7.getValueAt(row, 8)));
                txtsdt7.setText(String.valueOf(tbl7.getValueAt(row, 9)));
                txtngaybd7.setText(String.valueOf(tbl7.getValueAt(row, 10)));
                txtngaysinh7.setText(String.valueOf(tbl7.getValueAt(row, 4)));
                
              
            }
        });
    }//GEN-LAST:event_tbl7AncestorAdded

    private void tbl8AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tbl8AncestorAdded
        // TODO add your handling code here:
             ListSelectionModel listSelectionModel = tbl8.getSelectionModel();
        listSelectionModel.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int row = tbl8.getSelectedRow();
                txtmadm8.setText(String.valueOf(tbl8.getValueAt(row, 1)));
                txttendm8.setText(String.valueOf(tbl8.getValueAt(row, 2)));
                
                
              
            }
        });
    }//GEN-LAST:event_tbl8AncestorAdded

    private void txtngayban2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtngayban2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtngayban2ActionPerformed

    private void cbb91ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbb91ActionPerformed
        // TODO add your handling code here:
        defaultTableModel9.setRowCount(0);
        
        int stt=0;
        List<BanHang> banhang = userBH.findByNam(String.valueOf(cbb91.getSelectedItem()));
        for(BanHang users : banhang){
            stt++;
            defaultTableModel9.addRow(new Object[]{stt,users.getTenSP(),users.getSoLuong(),users.getNgayBan()});
        }
    }//GEN-LAST:event_cbb91ActionPerformed

    private void cbb92ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbb92ActionPerformed
        // TODO add your handling code here:
        defaultTableModel9.setRowCount(0);
        int stt=0;
        List<BanHang> banhang = userBH.findByThang(String.valueOf(cbb91.getSelectedItem()),String.valueOf(cbb92.getSelectedItem()));
        for(BanHang users : banhang){
            stt++;
            defaultTableModel9.addRow(new Object[]{stt,users.getTenSP(),users.getSoLuong(),users.getNgayBan()});
        }
    }//GEN-LAST:event_cbb92ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
         String str = JOptionPane.showInputDialog(this,"Vui lòng nhập tên khach hang",JOptionPane.INFORMATION_MESSAGE);
        
        defaultTableModel2.setRowCount(0);
        List<BanHang> user_DG = userBH.findByName(str);
        int sttdg=0;
        for(BanHang users : user_DG){
            sttdg++;
            defaultTableModel2.addRow(new Object[]{sttdg,users.getMaDH(),users.getHotenKH(),users.getTenSP(),users.getGia(),users.getSoLuong(),users.getSize(),users.getNgayBan(),users.getTongTien()});
        }
        if (defaultTableModel2.getRowCount()==0){
            JOptionPane.showMessageDialog(this,"Không tìm thấy","Thông báo", JOptionPane.ERROR_MESSAGE );
             int stttbl2 =0;
        List<BanHang> user_BH = userBH.getAll();
        for(BanHang users : user_BH){
            stttbl2++;
            defaultTableModel2.addRow(new Object[]{stttbl2,users.getMaDH(),users.getHotenKH(),users.getTenSP(),users.getGia(),users.getSoLuong(),users.getSize(),users.getNgayBan(),users.getTongTien()});
        }
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
        // TODO add your handling code here:
        defaultTableModel9.setRowCount(0);
        int stt=0;
        List<BanHang> banhang = userBH.getAll();
        for(BanHang users : banhang){
            stt++;
            defaultTableModel9.addRow(new Object[]{stt,users.getTenSP(),users.getSoLuong(),users.getNgayBan()});
        }
        
    }//GEN-LAST:event_RefreshActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jButton11ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GiaoDien_Manage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GiaoDien_Manage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GiaoDien_Manage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GiaoDien_Manage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GiaoDien_Manage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Refresh;
    private javax.swing.JButton btnadd1;
    private javax.swing.JButton btnadd3;
    private javax.swing.JButton btndelete1;
    private javax.swing.JButton btndelete2;
    private javax.swing.JButton btndelete3;
    private javax.swing.JButton btnsua1;
    private javax.swing.JButton btnsua2;
    private javax.swing.JButton btnsua3;
    private javax.swing.JButton btnsua4;
    private javax.swing.JButton btntimkiem3;
    private javax.swing.JButton btnxoa3;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JComboBox<String> cbb91;
    private javax.swing.JComboBox<String> cbb92;
    private javax.swing.JComboBox<String> cbbdanhmuc1;
    private javax.swing.JComboBox<String> cbbdm3;
    private javax.swing.JComboBox<String> cbbdm4;
    private javax.swing.JComboBox<String> cbbdm5;
    private javax.swing.JComboBox<String> cbbnguoinhan1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton83;
    private javax.swing.JButton jButton84;
    private javax.swing.JButton jButton85;
    private javax.swing.JButton jButton86;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButton91;
    private javax.swing.JButton jButton92;
    private javax.swing.JButton jButton93;
    private javax.swing.JButton jButton94;
    private javax.swing.JButton jButton95;
    private javax.swing.JButton jButton96;
    private javax.swing.JButton jButton97;
    private javax.swing.JButton jButton98;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel173;
    private javax.swing.JLabel jLabel174;
    private javax.swing.JLabel jLabel175;
    private javax.swing.JLabel jLabel176;
    private javax.swing.JLabel jLabel179;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel180;
    private javax.swing.JLabel jLabel181;
    private javax.swing.JLabel jLabel182;
    private javax.swing.JLabel jLabel183;
    private javax.swing.JLabel jLabel184;
    private javax.swing.JLabel jLabel185;
    private javax.swing.JLabel jLabel186;
    private javax.swing.JLabel jLabel189;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel190;
    private javax.swing.JLabel jLabel192;
    private javax.swing.JLabel jLabel193;
    private javax.swing.JLabel jLabel194;
    private javax.swing.JLabel jLabel195;
    private javax.swing.JLabel jLabel196;
    private javax.swing.JLabel jLabel197;
    private javax.swing.JLabel jLabel198;
    private javax.swing.JLabel jLabel199;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel200;
    private javax.swing.JLabel jLabel201;
    private javax.swing.JLabel jLabel202;
    private javax.swing.JLabel jLabel203;
    private javax.swing.JLabel jLabel204;
    private javax.swing.JLabel jLabel205;
    private javax.swing.JLabel jLabel206;
    private javax.swing.JLabel jLabel207;
    private javax.swing.JLabel jLabel209;
    private javax.swing.JLabel jLabel210;
    private javax.swing.JLabel jLabel211;
    private javax.swing.JLabel jLabel212;
    private javax.swing.JLabel jLabel213;
    private javax.swing.JLabel jLabel214;
    private javax.swing.JLabel jLabel215;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane33;
    private javax.swing.JTabbedPane jTabbedPane34;
    private javax.swing.JTabbedPane jTabbedPane35;
    private javax.swing.JRadioButton radionam6;
    private javax.swing.JRadioButton radionam7;
    private javax.swing.JRadioButton radionu6;
    private javax.swing.JRadioButton radionu7;
    private javax.swing.JTable tbl1;
    private javax.swing.JTable tbl2;
    private javax.swing.JTable tbl3;
    private javax.swing.JTable tbl4;
    private javax.swing.JTable tbl5;
    private javax.swing.JTable tbl6;
    private javax.swing.JTable tbl7;
    private javax.swing.JTable tbl8;
    private javax.swing.JTable tbl9;
    private javax.swing.JButton txtadd2;
    private javax.swing.JTextField txtchucvu7;
    private javax.swing.JTextField txtcmnd7;
    private javax.swing.JTextField txtdiachi6;
    private javax.swing.JTextField txtdiachi7;
    private javax.swing.JTextField txtgia1;
    private javax.swing.JTextField txtgia2;
    private javax.swing.JTextField txtgia3;
    private javax.swing.JTextField txtgia4;
    private javax.swing.JTextField txtgia5;
    private javax.swing.JTextField txthoten2;
    private javax.swing.JTextField txtluongcb7;
    private javax.swing.JLabel txtmadh2;
    private javax.swing.JLabel txtmadm8;
    private javax.swing.JLabel txtmakh6;
    private javax.swing.JLabel txtmanhap1;
    private javax.swing.JLabel txtmanv7;
    private javax.swing.JLabel txtmasp3;
    private javax.swing.JLabel txtmasp4;
    private javax.swing.JLabel txtmasp5;
    private javax.swing.JTextField txtngayban2;
    private javax.swing.JTextField txtngaybd7;
    private javax.swing.JTextField txtngaynhap1;
    private javax.swing.JTextField txtngaynhap3;
    private javax.swing.JTextField txtngaynhap4;
    private javax.swing.JTextField txtngaynhap5;
    private javax.swing.JTextField txtngaysinh6;
    private javax.swing.JTextField txtngaysinh7;
    private javax.swing.JTextField txtngdk6;
    private javax.swing.JTextField txtnguoigiao1;
    private javax.swing.JTextField txtnhaphanphoi1;
    private javax.swing.JTextField txtsdt6;
    private javax.swing.JTextField txtsdt7;
    private javax.swing.JTextField txtsize2;
    private javax.swing.JTextField txtsize3;
    private javax.swing.JTextField txtsize4;
    private javax.swing.JTextField txtsize5;
    private javax.swing.JTextField txtsoluong1;
    private javax.swing.JTextField txtsoluong2;
    private javax.swing.JTextField txtsoluong3;
    private javax.swing.JTextField txtsoluong4;
    private javax.swing.JTextField txtsoluong5;
    private javax.swing.JTextField txttendm8;
    private javax.swing.JTextField txttenkh6;
    private javax.swing.JTextField txttennv7;
    private javax.swing.JTextField txttensp1;
    private javax.swing.JTextField txttensp2;
    private javax.swing.JTextField txttensp3;
    private javax.swing.JTextField txttensp4;
    private javax.swing.JTextField txttensp5;
    private javax.swing.JTextField txttongtien1;
    private javax.swing.JLabel txttongtien2;
    // End of variables declaration//GEN-END:variables
}
