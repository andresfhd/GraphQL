package com.example.demo.query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.demo.model.Client;
import com.example.demo.service.GraphQLService;

@Component
public class StoreMutation implements GraphQLMutationResolver {
	
	@Autowired
    private GraphQLService graphQLService;
	
	public Client saveClient(String id, String fullName) {
        return graphQLService.saveClient(id, fullName);
    }
}
