gantt.templates.grid_row_class = function(start, end, task) {
    return "polarion-plan-row";
};
gantt.templates.grid_folder = function(item) {
    return "<span class='fa fa-bar-chart-o polarion-font-icon-16' style='line-height: 34px;height: 34px;padding-right: 4px;vertical-align: top;color: " + item.color + "'></span >";
};
gantt.templates.grid_file = function(item) {
    return "<span class='fa fa-bar-chart-o polarion-font-icon-16' style='line-height: 34px;height: 34px;padding-right: 4px;vertical-align: top;color: " + item.color + "'></span >";
};
gantt.templates.grid_open = function(item) {
    return "<div class='gantt_tree_icon gantt_blank'> </div>";
};
gantt.templates.scale_cell_class = function(date) {
    if (date.getDay() == 0 || date.getDay() == 6) {
        return "weekend";
    }
};
gantt.templates.task_cell_class = function(item, date) {
    if (date.getDay() == 0 || date.getDay() == 6) {
        return "weekend"
    }
};
gantt.templates.leftside_text = function(start, end, task) {
    var tclass = "polarion-PlanProgressMacro-leftCellGreen";
    if (task.done < task.idealProgress) {
        tclass = "polarion-PlanProgressMacro-leftCellRed";
    }
    if (task.todo == 0.0)
        return ""
    else
        return "<div class='" + tclass + "' style='font-size:14px;padding-right: 0px;'>" + task.todoAsString + "</div>";
};
formatFunc = gantt.date.date_to_str("%Y-%m-%d");
gantt.templates.tooltip_text = function(start,end,task){
    return "<b style='font-size:14px'> "
    	+ task.text + "</b>"
  		+ "<br/>" + formatFunc(start) + " - " + formatFunc(end)
        + "<br>Status: <b>" + task.statusName + "</b>"
        + "<br>Work Todo: <b>" + task.todoAsString + "</b>"
        + "<br>Work Done: <b>" + task.doneAsString + " (" + Math.round(task.progress*100) + "%)</b>"
        + "<br>Ideal Progress: <b>" + task.idealProgressAsString + "</b>";
};

