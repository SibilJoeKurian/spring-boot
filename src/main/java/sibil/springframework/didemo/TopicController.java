package sibil.springframework.didemo;

import SpringController.Topics;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TopicController {
    @Autowired
    TopicService topicService;
    @RequestMapping(method= RequestMethod.GET,value="/topics")
    public List<Topics> getAllTopics(){
        return topicService.getAlltopics();
    }
    @RequestMapping(method =RequestMethod.GET,value="/topics/{id}")
    public Topics getTopic(@PathVariable String id){
        return topicService.getParticularTopic(id);
    }
    @RequestMapping(method= RequestMethod.POST,value="/topics")
    public void addTopics(@RequestBody Topics contentid){
        System.out.println(contentid);
        topicService.addTopics(contentid);
    }

}
