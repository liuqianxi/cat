package com.dianping.cat.report.page.event;

public enum JspFile {
	GRAPHS("/jsp/report/event/event_graphs.jsp"),

	HISTORY_GRAPH("/jsp/report/event/eventHistoryGraphs.jsp"),

	HISTORY_REPORT("/jsp/report/event/eventHistoryReport.jsp"),

	HOURLY_REPORT("/jsp/report/event/event.jsp");

	private String m_path;

	private JspFile(String path) {
		m_path = path;
	}

	public String getPath() {
		return m_path;
	}
}
