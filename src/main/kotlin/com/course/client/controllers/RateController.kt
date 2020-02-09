package com.course.client.controllers

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Controller
class RateController {

    @Value("\${rate}")
    lateinit var rate: String

    @Value("\${lanecount}")
    lateinit var lanecount: String

    @Value("\${tollstart}")
    lateinit var tollstart: String


    @RequestMapping("rate")
    fun getRate(m: Model) : String {
        m.addAttribute("rateamount", rate)
        m.addAttribute("lanes", lanecount)
        m.addAttribute("tollstart", tollstart)

//        return "'Your rate is: ' + ${rate}, 'number of lanes: ' +${lanecount}  + 'total start and end: ' + ${tollstart}  "
        return "rateView"
    }
}