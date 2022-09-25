package com.test.logical;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class FindMostVisitedUrlList {

	public static void main(String[] args) {
		List<String> urlList = new ArrayList<>();

		urlList.add("www.google.com");
		urlList.add("www.google.com");
		urlList.add("www.google.com");
		urlList.add("www.mail.google.com");
		urlList.add("www.mail.google.com");
		urlList.add("www.mail.google.com");
		urlList.add("www.mail.google.com");
		urlList.add("www.amazon.com");
		urlList.add("www.amazon.com");
		urlList.add("www.amazon.com");
		urlList.add("www.amazon.com");
		urlList.add("www.twitter.com");
		urlList.add("www.twitter.com");
		urlList.add("www.twitter.com");
		urlList.add("www.twitter.com");
		urlList.add("www.linkedin.com");
		urlList.add("www.linkedin.com");
		urlList.add("www.linkedin.com");
		urlList.add("www.linkedin.com");
		urlList.add("www.linkedin.com");
		Website site = new Website();
		Map<String, Integer> mostVisitedUrl = site.getVisitedUrl(urlList);

		for (Map.Entry<String, Integer> entry : mostVisitedUrl.entrySet()) {
			System.out.println("Most Visited Url: " + entry.getKey() + "  Visited count : " + entry.getValue());
		}
		// mostVisitedSite.stream().forEach((sit) -> System.out.println(sit));
	}

}

class Website {

	public Map<String, Integer> getVisitedUrl(List<String> urlList) {
		Map<String, Integer> urlHitCount = getUrlHitCount(urlList);
		return getSortedMap(urlHitCount);

	}

	private Map<String, Integer> getUrlHitCount(List<String> urlList) {
		Map<String, Integer> urlHitCount = new HashMap<>();
		// for (String url : urlList)
		urlList.forEach(url -> {
			if (urlHitCount.get(url) != null) {
				urlHitCount.put(url, urlHitCount.get(url) + 1);
			} else {
				urlHitCount.put(url, 1);
			}
		});
		return urlHitCount;
	}

//
	private Map<String, Integer> getSortedMap(Map<String, Integer> map) {
		List<Map.Entry<String, Integer>> linkedList = new LinkedList<>(map.entrySet());
		Collections.sort(linkedList, (i1, i2) -> i2.getValue().compareTo(i1.getValue()));

		Map<String, Integer> sortedLinkedMap = new LinkedHashMap<>();

		// for (Map.Entry<String, Integer> entry : linkedList)
		linkedList.forEach(entry -> {
			sortedLinkedMap.put(entry.getKey(), entry.getValue());
		});
		return sortedLinkedMap;

	}
}
