package com.fpolydatn.core.giangvien.model.response;

import com.fpolydatn.entity.ChuyenNganh;
import com.fpolydatn.entity.GiangVienHuongDan;
import com.fpolydatn.entity.NhomDatn;
import com.fpolydatn.entity.SinhVien;
import com.fpolydatn.entity.base.IsIdentified;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

/**
 * @author thangdt
 */

@Projection(types = {NhomDatn.class, SinhVien.class, ChuyenNganh.class, GiangVienHuongDan.class})
public interface GvNhomDatnResponse extends IsIdentified {

    @Value("#{target.stt}")
    Integer getStt();

    @Value("#{target.ten_de_tai}")
    String getTenDeTai();

    @Value("#{target.ma_nhom}")
    String getMaNhom();

    @Value("#{target.ma_mon}")
    String getMaMon();

    @Value("#{target.total_ma_sinh_vien}")
    String getTotalMaSinhVien();

    @Value("#{target.trang_thai}")
    int getTrangThai();

}
