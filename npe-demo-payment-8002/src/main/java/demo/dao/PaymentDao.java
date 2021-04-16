package demo.dao;

import demo.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author lp
 * @date 2021-04-13
 */
@Mapper
public interface PaymentDao {

    int create(Payment payment);

    Payment findById(@Param("id") Long id);

}
