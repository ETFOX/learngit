package cn.caijiajia.jrssupplier.controller;

import cn.caijiajia.jrssupplier.delegator.JrsDelegator;
import cn.caijiajia.suppliercommon.jrs.bo.req.JzdReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private JrsDelegator jrsDelegator;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String getJzdReportInfo() {
        JzdReq jzdReq = new JzdReq();
        System.out.println(jrsDelegator.getJzdReportInfo(jzdReq));
        return "===>";
    }

}
