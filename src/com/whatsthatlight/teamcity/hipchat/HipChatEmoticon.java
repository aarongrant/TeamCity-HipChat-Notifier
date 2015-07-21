/**
Copyright 2014 Pieter Rautenbach

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

  http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */

package com.whatsthatlight.teamcity.hipchat;

import org.codehaus.jackson.annotate.JsonProperty;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
 
@JsonIgnoreProperties(ignoreUnknown = true)
public class HipChatEmoticon {
	
	@JsonProperty("id")
	public String id;

	@JsonProperty("links")
	public HipChatApiResponseLinks links;
	
	@JsonProperty("shortcut")
	public String shortcut;

	@JsonProperty("url")
	public String url;
	
	public HipChatEmoticon() {
		// Intentionally left empty
	}
	
	public HipChatEmoticon(String id, HipChatApiResponseLinks links, String shortcut, String url) {
		this.id = id;
		this.links = links;
		this.shortcut = shortcut;
		this.url = url;
	}
	
}
