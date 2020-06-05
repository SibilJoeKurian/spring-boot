package sibil.springframework.didemo;

import SpringController.Topics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TopicController {
    @Autowired
    TopicService topicService;
    @RequestMapping("/topics")
    public List<Topics> getAllTopics(){
        return topicService.getAlltopics();
    }
    @RequestMapping("/topics/{id}")
    public Topics getTopic(@PathVariable String id){
        return topicService.getParticularTopic(id);
    }

}
