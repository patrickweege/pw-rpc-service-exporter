package rpc.service.exporter.test.webapp.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import rpc.service.exporter.commons.servlet.AbstractRPCServiceServlet;

@WebServlet(urlPatterns = { "/describe/*", "/lookup/*", "/invoke/*" }, //
		initParams = { //
				@WebInitParam( //
						name = AbstractRPCServiceServlet.INIT_RPC_SERVICE_EXPORTER_PROVIDER, //
						value = "rpc.service.exporter.test.webapp.service.provider.TestServiceExporterProvider"), //
				@WebInitParam(name = AbstractRPCServiceServlet.INIT_LOOKUP_PATH, value = "/lookup"), //
				@WebInitParam(name = AbstractRPCServiceServlet.INIT_DESCRIBE_PATH, value = "/describe"), //
				@WebInitParam(name = AbstractRPCServiceServlet.INIT_INVOKE_PATH, value = "/invoke") //
		}//
)
@MultipartConfig
public class RPCServiceServlet extends AbstractRPCServiceServlet {

	private static final long serialVersionUID = 5610644570034789146L;

	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		super.service(req, resp);
		
		
		
	}
}
