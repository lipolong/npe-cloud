package demo.service.impl;

import demo.dao.PaymentDao;
import demo.entity.Payment;
import demo.service.IPaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author lp
 * @date 2021-04-15
 */
@Service
public class PaymentServiceImpl implements IPaymentService {

    @Resource
    private PaymentDao paymentDao;


    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    public Payment findById(Long id) {
        return paymentDao.findById(id);
    }
}
