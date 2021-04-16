package demo.controller;

import com.npe.common.api.CommResult;
import demo.entity.Payment;
import demo.service.IPaymentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

/**
 * @author lp
 * @date 2021-04-15
 */
@Slf4j
@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class PaymentController {

    @Autowired
    private IPaymentService iPaymentService;
    @Value("${server.port}")
    private String port;


    @PostMapping("/payment/create")
    public CommResult create(@RequestBody Payment payment) {
        if(StringUtils.isEmpty(payment.getSerial())){
            return new CommResult(HttpStatus.NOT_FOUND.value(), "失败:"+port);
        }
        int result = iPaymentService.create(payment);
        if(result>0){
            return new CommResult(HttpStatus.OK.value(), "成功:"+port);
        }
        return new CommResult(HttpStatus.NOT_FOUND.value(), "失败:"+port);
    }

    @GetMapping("/payment/findById/{id}")
    public CommResult findById(@PathVariable Long id) {
        Payment payment = iPaymentService.findById(id);
        if(payment!=null){
            return new CommResult(HttpStatus.OK.value(), "查询成功",payment);
        }
        return new CommResult(HttpStatus.NOT_FOUND.value(), "没有对应记录");
    }


}
