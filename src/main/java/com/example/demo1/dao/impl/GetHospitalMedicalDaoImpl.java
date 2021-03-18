package com.example.demo1.dao.impl;

import com.example.demo1.dao.HospitalMedicalDao;
import com.example.demo1.pojo.HospitalMedical;

import java.util.List;

/**
 * @author 关鑫
 * @date 2021/3/18 10:29 星期四
 */

public class GetHospitalMedicalDaoImpl extends BaseDao implements HospitalMedicalDao {

    /**
     * 通过id查询就诊人信息
     * @param userid
     * @return
     */
    @Override
    public List<HospitalMedical> queryHospitalMedicalDaoid(int userid) {
        String sql = "select * from hospitalmedical where userId = ?";
        return queryForList(HospitalMedical.class,sql,userid);
    }

    @Override
    public int querHospitalMedicalDaoset(HospitalMedical cal) {
        String sql = "INSERT INTO hospitalmedical(name,cardId,tel,sex,birthday,adders,userId) VALUES (?,?,?,?,?,?,?)";
        return update(sql,cal.getName(),cal.getCardId(),cal.getTel(),cal.getSex(),cal.getBirthday(),cal.getAdders(),cal.getUserId());
    }
}
