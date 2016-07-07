package innovation.be.controller;

import com.google.common.collect.ImmutableMap;
import innovation.be.domain.City;
import innovation.be.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
public class TimeController {

    private static final long HOUR_MS = 60 * 60 * 1000L;

    @Autowired
    private CityRepository cityRepository;

    @ResponseBody
    @RequestMapping("/time")
    public Map<String, Object> getTime(@RequestParam(name = "city", required = false) String cityName) {
        Map<String, Object> response = new HashMap<>();

        if (cityName != null) {
            City city = cityRepository.findByName(cityName);
            response.put("timestamp", getOffsetTime(System.currentTimeMillis(), city.getOffset()));
            response.put("name", city.getName());
            response.put("offset", city.getOffset());
        } else {
            response.put("timestamp", System.currentTimeMillis());
        }

        return response;
    }

    @ResponseBody
    @RequestMapping("/times")
    public Map<String, Long> getTimeInCities() {
        long now = System.currentTimeMillis();
        return cityRepository.findAll()
                .stream()
                .collect(Collectors.toMap(City::getName,
                        city -> getOffsetTime(now, city.getOffset())));

    }

    private static long getOffsetTime(long time, int offset) {
        return time + HOUR_MS * offset;
    }

}
