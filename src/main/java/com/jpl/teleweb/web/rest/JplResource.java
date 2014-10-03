package com.jpl.teleweb.web.rest;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.QueryParam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jpl.teleweb.domain.RawLine;
import com.jpl.teleweb.repository.RawLineRepository;

/**
 * REST controller for managing users.
 */
@RestController
@RequestMapping("/jpl")
public class JplResource {

    private final Logger log = LoggerFactory.getLogger(JplResource.class);

	@Inject
	RawLineRepository rawLineRepository;

	@RequestMapping("/save")
	public void storeRaw(@QueryParam("raw") final String raw) {
		log.debug("Raw value : {}", raw);
		RawLine rawLine = new RawLine();
		rawLine.setLine(raw);
		rawLineRepository.save(rawLine);

	}

	@RequestMapping(value = "/displayRaws", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<RawLine> displayRaws() {
		final List<RawLine> rawLines = rawLineRepository.findAll();
		log.debug("Raw value : {}", rawLines);
		return rawLines;
	}

}
