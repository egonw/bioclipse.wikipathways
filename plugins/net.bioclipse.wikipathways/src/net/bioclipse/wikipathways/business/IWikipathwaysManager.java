/*******************************************************************************
 * Copyright (c) 2012  Andra Waagmeester <andra.waagmeester@gmail.com>
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contact: http://www.bioclipse.net/
 ******************************************************************************/
package net.bioclipse.wikipathways.business;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import net.bioclipse.core.PublishedClass;
import net.bioclipse.core.PublishedMethod;
import net.bioclipse.core.Recorded;
import net.bioclipse.managers.business.IBioclipseManager;

import org.pathvisio.core.model.ConverterException;

@PublishedClass(
    value="Manager that allows interaction with WikiPathways.",
    doi="10.1371/journal.pbio.0060184"
)
public interface IWikipathwaysManager extends IBioclipseManager {

	@Recorded
	@PublishedMethod(
	    methodSummary = "Returns list of organisms covered in WikiPathways."
	)
    public List<String> listOrganisms()
	throws IOException;
	  
	@Recorded
	@PublishedMethod(
	    params = "String organism", 
	    methodSummary = "Returns list of pathways for a given organism covered in WikiPathways."
	)
    public List<String> listPathways(String organism)
	throws IOException;

    @Recorded
    @PublishedMethod(
        params = "String pwId, Integer revision", 
        methodSummary = "Download the pathway from WikiPathways."
    )
    public String getPathway(String pwId, Integer revision)
	throws IOException, ConverterException;

//	  @Recorded
//	  @PublishedMethod(
//	        params = "String pwId", 
//	        methodSummary = "Get some general info about the pathway, such as the name, species, without downloading the GPML."
//	        	
//	    )
//    public String getPathwayInfo(String pwId)
//	throws ParserConfigurationException, SAXException, IOException, TransformerException;

    @Recorded
    @PublishedMethod(
        params = "String pwId",
        methodSummary = "Get the revision history of a pathway."
    )
    public List<String> getPathwayHistory(String pwId)
	throws IOException, ParseException;
	  
//	  @Recorded
//	  @PublishedMethod(
//	        params = "String timestamp", 
//	        methodSummary = "Get the recently changed pathways."
//	        	
//	    )
//    public String getRecentChanges(String timestamp)
//	throws ParserConfigurationException, SAXException, IOException, TransformerException;
//	  
//	  @Recorded
//	  @PublishedMethod(
//	        params = "Find pathways using a textual search on the description and text labels of the pathway objects.", 
//	        methodSummary = "Get the recently changed pathways."
//	        	
//	    )
//    public String findPathwaysByText(String query, String species)
//	throws ParserConfigurationException, SAXException, IOException, TransformerException;
//	  
//	  @Recorded
//	  @PublishedMethod(
//	        params = "Find pathways using a textual search on the description and text labels of the pathway objects.", 
//	        methodSummary = "Get the recently changed pathways."
//	        	
//	    )
//    public String findPathwaysByXref(String[] ids, String codes)
//	throws ParserConfigurationException, SAXException, IOException, TransformerException;
//	  
//	  @Recorded
//	  @PublishedMethod(
//	        params = "Find pathways using a textual search on the description and text labels of the pathway objects.", 
//	        methodSummary = "Get the recently changed pathways."
//	        	
//	    )
//    public String findInteractions(String query)
//	throws ParserConfigurationException, SAXException, IOException, TransformerException;
//	  
//	  @Recorded
//	  @PublishedMethod(
//	        params = "Find pathways using a textual search on the description and text labels of the pathway objects.", 
//	        methodSummary = "Get the recently changed pathways."
//	        	
//	    )
//    public String findPathwaysByLiterature(String query)
//	throws ParserConfigurationException, SAXException, IOException, TransformerException;
}
