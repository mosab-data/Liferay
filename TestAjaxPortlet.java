package com.opensource.techblog.portlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import com.liferay.util.bridges.mvc.MVCPortlet;

public class TestAjaxPortlet extends MVCPortlet {

private static Log _log = LogFactoryUtil.getLog(TestAjaxPortlet.class.getName());
    @Override
    public void serveResource(ResourceRequest resourceRequest,
            ResourceResponse resourceResponse) throws IOException,
            PortletException {
        
        resourceResponse.setContentType("text/html");
        PrintWriter out = resourceResponse.getWriter();
        out.println("AUI Ajax call is performed");
        out.flush();
        super.serveResource(resourceRequest, resourceResponse);
    }
}
